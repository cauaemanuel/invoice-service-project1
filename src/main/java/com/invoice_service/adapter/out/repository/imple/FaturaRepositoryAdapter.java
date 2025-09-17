package com.invoice_service.adapter.out.repository.imple;

import com.invoice_service.adapter.out.repository.entity.FaturaEntity;
import com.invoice_service.application.core.domain.Fatura;
import com.invoice_service.application.core.mapper.FaturaMapper;
import com.invoice_service.application.ports.out.FaturaRepositoryOutPort;

public class FaturaRepositoryAdapter implements FaturaRepositoryOutPort {

    private SpringFaturaRepository springFaturaRepository;
    private FaturaMapper faturaMapper;

    public FaturaRepositoryAdapter(SpringFaturaRepository springFaturaRepository, FaturaMapper faturaMapper) {
        this.springFaturaRepository = springFaturaRepository;
        this.faturaMapper = faturaMapper;
    }

    @Override
    public void salvar(Fatura fatura) {

        var faturaEntity = faturaMapper.domainToEntity(fatura);
        springFaturaRepository.save(faturaEntity);
    }
}
