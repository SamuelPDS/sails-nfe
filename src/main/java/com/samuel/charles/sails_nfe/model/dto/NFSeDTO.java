package com.samuel.charles.sails_nfe.model.dto;

import com.samuel.charles.sails_nfe.model.entity.Company;
import com.samuel.charles.sails_nfe.model.entity.Customer;
import com.samuel.charles.sails_nfe.model.entity.Service;
import lombok.Data;

@Data
public class NFSeDTO {
    private Long id;
    private Company company;
    private Customer customer;
    private Service service;
    // getters e setters
}

