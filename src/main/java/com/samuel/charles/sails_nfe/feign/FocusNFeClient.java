package com.samuel.charles.sails_nfe.feign;

import com.samuel.charles.sails_nfe.model.dto.NFeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "focus-nfe-client", url = "${focus-api.url}")
public interface FocusNFeClient {
    @PostMapping
    void sendNFe(NFeDTO nfe);
}
