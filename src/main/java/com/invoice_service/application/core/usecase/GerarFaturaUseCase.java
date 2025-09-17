package com.invoice_service.application.core.usecase;

import com.invoice_service.application.core.domain.Fatura;
import com.invoice_service.application.core.domain.enums.StatusPagamento;
import com.invoice_service.application.ports.out.FaturaRepositoryOutPort;

public class GerarFaturaUseCase {

    private FaturaRepositoryOutPort faturaRepository;

    public GerarFaturaUseCase(FaturaRepositoryOutPort faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public void gerarFatura(Fatura fatura){
        fatura.setStatusPagamento(StatusPagamento.PENDENTE);
        var faturaEntity = Fatura.toEntity(fatura);

    }
}
