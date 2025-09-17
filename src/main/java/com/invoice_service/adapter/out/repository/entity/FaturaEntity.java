package com.invoice_service.adapter.out.repository.entity;

import com.invoice_service.application.core.domain.Fatura;
import com.invoice_service.application.core.domain.enums.StatusPagamento;
import lombok.*;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Document(collection = "faturas")
public class FaturaEntity {

    @Id
    private UUID codigoFatura;
    private Double quantia;
    private LocalDate dataVencimento;
    private StatusPagamento statusPagamento;
    private String cpfCliente;

    public FaturaEntity() {
        this.codigoFatura = UUID.randomUUID();
    }

    public void atualizarStatus(String novoStatusStr) {
        StatusPagamento novoStatus = StatusPagamento.valueOf(novoStatusStr.toUpperCase());
        this.statusPagamento = novoStatus;
    }
}