package com.samuel.charles.sails_nfe.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NFe {
    private Long id;
    private Company company;
    private Customer customer;
    private Product product;
}

