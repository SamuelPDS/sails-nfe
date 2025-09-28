package com.samuel.charles.sails_nfe.repository;

import com.samuel.charles.sails_nfe.model.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}

