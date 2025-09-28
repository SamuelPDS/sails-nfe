package com.samuel.charles.sails_nfe.repository;

import com.samuel.charles.sails_nfe.model.entity.NFSe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NFSeRepository extends JpaRepository<NFSe, Long> {
}

