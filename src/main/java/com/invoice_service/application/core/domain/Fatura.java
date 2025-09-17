package com.invoice_service.application.core.domain;

import com.invoice_service.application.core.domain.enums.StatusPagamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fatura {

    private String numeroFatura;
    private String quantia;
    private String dataVencimento;
    private StatusPagamento statusPagamento;
    private String cpfCliente;

    public void atualizarStatus(String novoStatusStr) {
        StatusPagamento novoStatus = StatusPagamento.valueOf(novoStatusStr.toUpperCase());
        this.statusPagamento = novoStatus;
    }
}