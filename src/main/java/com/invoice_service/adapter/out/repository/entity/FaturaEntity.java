package com.invoice_service.adapter.out.repository.entity;

import com.invoice_service.application.core.domain.enums.StatusPagamento;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@Document(collection = "faturas")
public class FaturaEntity {

    @Id
    private UUID codigoFatura;
    private String quantia;
    private String dataVencimento;
    private StatusPagamento statusPagamento;
    private String cpfCliente;

    public FaturaEntity() {
        this.codigoFatura = UUID.randomUUID();
    }

    public FaturaEntity(String quantia, String dataVencimento, StatusPagamento statusPagamento, String cpfCliente) {
        this.codigoFatura= UUID.randomUUID();
        this.quantia = quantia;
        this.dataVencimento = dataVencimento;
        this.statusPagamento = statusPagamento;
        this.cpfCliente = cpfCliente;
    }

    public FaturaEntity(UUID codigoFatura, String quantia, String dataVencimento, StatusPagamento statusPagamento, String cpfCliente) {
        this.codigoFatura = codigoFatura;
        this.quantia = quantia;
        this.dataVencimento = dataVencimento;
        this.statusPagamento = statusPagamento;
        this.cpfCliente = cpfCliente;
    }

    public void atualizarStatus(String novoStatusStr) {
        StatusPagamento novoStatus = StatusPagamento.valueOf(novoStatusStr.toUpperCase());
        this.statusPagamento = novoStatus;
    }
}