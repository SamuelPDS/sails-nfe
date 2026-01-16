package com.samuel.charles.sails_nfe.model.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String codigo;
    private String descricao;
    private String quantidade;
    private Double valorUnitario;
    private Double valorTotal;
    // getters e setters
}

