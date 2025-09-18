package com.invoice_service.application.core.usecase;

import com.invoice_service.adapter.in.dto.GerarFaturaDTO;
import com.invoice_service.application.core.domain.Fatura;
import com.invoice_service.application.core.domain.enums.StatusPagamento;
import com.invoice_service.application.core.mapper.FaturaMapper;
import com.invoice_service.application.ports.out.FaturaRepositoryOutPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GerarFaturaUseCase {

    private FaturaRepositoryOutPort faturaRepository;
    private FaturaMapper faturaMapper;

    public GerarFaturaUseCase(FaturaRepositoryOutPort faturaRepository, FaturaMapper faturaMapper) {
        this.faturaRepository = faturaRepository;
        this.faturaMapper = faturaMapper;
    }

    public void gerarFatura(GerarFaturaDTO dto){
        validarFaturaDTO(dto);
        Fatura fatura = faturaMapper.dtoToDomain(dto);
        log.info("Gerando fatura para o cliente com CPF: {}", dto.getCpfCliente());
        System.out.println(fatura);
        faturaRepository.salvar(fatura);
    }

    private boolean validarFaturaDTO(GerarFaturaDTO dto) {
        if (dto.getQuantia() == null || dto.getQuantia() <= 0) {
            throw new IllegalArgumentException("A quantia deve ser maior que zero.");
        }
        if (dto.getDataVencimento() == null || dto.getDataVencimento().isBefore(java.time.LocalDate.now())) {
            throw new IllegalArgumentException("A data de vencimento deve ser uma data futura.");
        }
        return true;
    }

}


