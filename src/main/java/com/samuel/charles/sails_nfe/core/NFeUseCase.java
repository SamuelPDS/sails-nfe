package com.samuel.charles.sails_nfe.core;

import com.samuel.charles.sails_nfe.model.dto.NFeDTO;

public interface NFeUseCase {
    void processNFe(NFeDTO dto);

    NFeDTO getById(Integer id);

    NFeDTO update(Integer id, NFeDTO dto);
}
