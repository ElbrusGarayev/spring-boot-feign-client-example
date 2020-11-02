package com.azercell.subscriptions.controller;

import com.azercell.subscriptions.model.AzercellApiResponse;
import com.azercell.subscriptions.service.AzercellService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AzercellSubsController {

    private final AzercellService azercellService;

    @GetMapping("subscriptions")
    public ResponseEntity<AzercellApiResponse> getSubscriptions(){
        return ResponseEntity.ok(azercellService.getBody());
    }
}
