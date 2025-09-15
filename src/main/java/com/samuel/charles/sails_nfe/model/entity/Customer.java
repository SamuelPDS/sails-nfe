package com.samuel.charles.sails_nfe.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    private Long id;
    private String name;
    private String email;
    private String document;
    private String phone;
    private Address address;
}
