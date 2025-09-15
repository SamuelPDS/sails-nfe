package com.samuel.charles.sails_nfe.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ServiceDTO {
    private Long id;
    private Integer aliquota;
    private String discriminacao;
    private Boolean iss_retido;
    private String item_lista_servico;
    private String codigo_tributario_municipio;
    private BigDecimal valor_servicos;
}

