package com.invoice_service.application.core.domain;

import com.invoice_service.adapter.out.repository.entity.FaturaEntity;
import com.invoice_service.application.core.domain.enums.StatusPagamento;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fatura {

    private UUID codigoFatura;
    private String quantia;
    private String dataVencimento;
    private StatusPagamento statusPagamento;
    private String cpfCliente;

    public static FaturaEntity toEntity(Fatura fatura) {
        return new FaturaEntity(
                fatura.getCodigoFatura(),
                fatura.getQuantia(),
                fatura.getDataVencimento(),
                fatura.getStatusPagamento(),
                fatura.getCpfCliente()
        );
    }

    public void atualizarStatus(String novoStatusStr) {
        StatusPagamento novoStatus = StatusPagamento.valueOf(novoStatusStr.toUpperCase());
        this.statusPagamento = novoStatus;
    }
}