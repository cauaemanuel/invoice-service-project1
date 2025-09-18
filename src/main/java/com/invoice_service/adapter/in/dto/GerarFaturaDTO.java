package com.invoice_service.adapter.in.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class GerarFaturaDTO {

    @NotNull
    private final Double quantia;

    @NotNull
    private final LocalDate dataVencimento;

    @NotBlank
    private final String cpfCliente;

    public GerarFaturaDTO(@NotNull Double quantia, @NotNull LocalDate dataVencimento, @NotBlank String cpfCliente) {
        this.quantia = quantia;
        this.dataVencimento = dataVencimento;
        this.cpfCliente = cpfCliente;
    }

    public Double getQuantia() {
        return quantia;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }
}