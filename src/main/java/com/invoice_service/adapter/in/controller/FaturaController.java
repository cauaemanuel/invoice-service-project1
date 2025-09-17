package com.invoice_service.adapter.in.controller;


import com.invoice_service.adapter.in.dto.GerarFaturaDTO;
import com.invoice_service.application.core.usecase.GerarFaturaUseCase;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faturas")
public class FaturaController {

    private GerarFaturaUseCase gerarFaturaUseCase;

    public FaturaController(GerarFaturaUseCase gerarFaturaUseCase) {
        this.gerarFaturaUseCase = gerarFaturaUseCase;
    }

    @PostMapping
    public ResponseEntity gerarFatura(@RequestBody @Valid GerarFaturaDTO gerarFaturaDTO) {
        gerarFaturaUseCase.gerarFatura(gerarFaturaDTO);
        return ResponseEntity.ok().build();
    }
}
