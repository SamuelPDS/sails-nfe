package com.samuel.charles.sails_nfe.controller;

import com.samuel.charles.sails_nfe.model.dto.NFeDTO;
import com.samuel.charles.sails_nfe.service.NFeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/nfe")
@Tag(name = "Auth Controller")
public class NfeController {
    @Autowired
    NFeService nFeService;


    @PostMapping
    public ResponseEntity<NFeDTO> createNfg(@RequestBody NFeDTO dto) {
        nFeService.processNFe(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NFeDTO> getNfe(@PathVariable Integer id) {
        NFeDTO nfe = nFeService.getById(id);
        return ResponseEntity.ok(nfe);
    }

    @PutMapping("/{id}")
    public ResponseEntity<NFeDTO> updateNfe(
            @PathVariable Integer id,
            @RequestBody NFeDTO dto
    ) {
        NFeDTO updated = nFeService.update(id, dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNfe(@PathVariable Integer id) {
        nFeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
