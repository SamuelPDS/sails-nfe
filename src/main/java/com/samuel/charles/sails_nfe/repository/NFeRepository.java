package com.samuel.charles.sails_nfe.repository;

import com.samuel.charles.sails_nfe.model.entity.NFe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NFeRepository extends JpaRepository<NFe, Long> {

}
