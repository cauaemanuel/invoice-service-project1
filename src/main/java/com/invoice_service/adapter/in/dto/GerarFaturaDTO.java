package com.invoice_service.adapter.in.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record GerarFaturaDTO(
        @NotNull Double quantia,
        @NotNull LocalDate dataVencimento,
        @NotBlank String cpfCliente) {
}
