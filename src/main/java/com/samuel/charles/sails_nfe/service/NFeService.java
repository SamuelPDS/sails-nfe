package com.samuel.charles.sails_nfe.service;

import com.samuel.charles.sails_nfe.core.NFeUseCase;
import com.samuel.charles.sails_nfe.model.dto.NFeDTO;
import com.samuel.charles.sails_nfe.model.dto.ProductDTO;
import com.samuel.charles.sails_nfe.model.entity.Address;
import com.samuel.charles.sails_nfe.model.entity.Company;
import com.samuel.charles.sails_nfe.model.entity.Customer;
import com.samuel.charles.sails_nfe.model.entity.NFe;
import com.samuel.charles.sails_nfe.model.entity.Product;
import com.samuel.charles.sails_nfe.repository.NFeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class NFeService implements NFeUseCase {
    @Autowired
    NFeRepository nFeRepository;

    @Override
    public void processNFe(NFeDTO dto) {
        log.info("ℹ️ processando dados para nota");
        try{
            NFe entity = transformToEntity(dto);
            nFeRepository.save(entity);
            log.info("✅ NFe salva com sucesso: {}", entity.getId());
        } catch (Exception e) {
            log.warn("⚠️ NFe não gerada a partir do DTO informado: {}", e.getMessage());

        }
    }

    private NFe transformToEntity(NFeDTO dto) {
        if (Objects.isNull(dto)) return null;
        return NFe.builder()
                .company(buildCompanyFromDto(dto))
                .customer(buildCustomerFromDto(dto))
                .products(buildProductsFromDto(dto.getItems()))
                .build();
    }

    private Company buildCompanyFromDto(NFeDTO dto) {
        if (dto == null) return null;

        Address addr = Address.builder()
                .street(dto.getLogradouroEmitente())
                .number(dto.getNumeroEmitente() == null ? null : String.valueOf(dto.getNumeroEmitente()))
                .neighborhood(dto.getBairroEmitente())
                .city(dto.getMunicipioEmitente())
                .state(dto.getUfEmitente())
                .zipCode(dto.getCepEmitente())
                .build();

        return Company.builder()
                .name(dto.getNomeEmitente())
                .cnpj(dto.getCnpjEmitente())
                .address(Collections.singletonList(addr))
                .build();
    }

    private Customer buildCustomerFromDto(NFeDTO dto) {
        if (dto == null) return null;

        Customer customer = Customer.builder()
                .name(dto.getNomeDestinatario())
                .document(dto.getCpfDestinatario())
                .email(null)
                .phone(dto.getTelefoneDestinatario())
                .build();

        Address addr = Address.builder()
                .street(dto.getLogradouroDestinatario())
                .number(dto.getNumeroDestinatario() == null ? null : String.valueOf(dto.getNumeroDestinatario()))
                .neighborhood(dto.getBairroDestinatario())
                .city(dto.getMunicipioDestinatario())
                .state(dto.getUfDestinatario())
                .zipCode(dto.getCepDestinatario())
                .customer(customer)
                .build();

        customer.setAddress(Collections.singletonList(addr));
        return customer;
    }

    private List<Product> buildProductsFromDto(List<ProductDTO> items) {
        if (items == null || items.isEmpty()) return new ArrayList<>();
        List<Product> list = new ArrayList<>();
        for (ProductDTO p : items) {
            if (p == null) continue;
            Product product = Product.builder()
                    .id(p.getId())
                    .name(p.getName())
                    .description(p.getDescription())
                    .price(p.getPrice())
                    .build();
            list.add(product);
        }
        return list;
    }
}
