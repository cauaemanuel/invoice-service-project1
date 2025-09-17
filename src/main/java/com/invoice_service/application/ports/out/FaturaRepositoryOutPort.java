package com.invoice_service.application.ports.out;

import com.invoice_service.application.core.domain.Fatura;

public interface FaturaRepositoryOutPort {

    void salvar(Fatura fatura);
}
