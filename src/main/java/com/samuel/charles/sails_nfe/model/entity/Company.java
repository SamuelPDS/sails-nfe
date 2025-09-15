package com.samuel.charles.sails_nfe.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Company {
    private Long id;
    private String name;
    private String cnpj;
    private Address address;
}

