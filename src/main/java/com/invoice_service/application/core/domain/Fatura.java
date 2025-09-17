package com.invoice_service.application.core.domain;

import com.invoice_service.adapter.in.dto.GerarFaturaDTO;
import com.invoice_service.adapter.out.repository.entity.FaturaEntity;
import com.invoice_service.application.core.domain.enums.StatusPagamento;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fatura {

    private UUID codigoFatura = UUID.randomUUID();
    private Double quantia;
    private LocalDate dataVencimento;
    private StatusPagamento statusPagamento;
    private String cpfCliente;

    public void atualizarStatus(String novoStatusStr) {
        StatusPagamento novoStatus = StatusPagamento.valueOf(novoStatusStr.toUpperCase());
        this.statusPagamento = novoStatus;
    }
}