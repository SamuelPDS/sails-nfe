package com.samuel.charles.sails_nfe.model.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProductDTO {
    private Integer id;
    private String code;
    private String name;
    private String description;
    private String amount;
    private Double unitValue;
    private Double totalValue;
}

