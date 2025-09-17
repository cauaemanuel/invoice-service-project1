package com.invoice_service.application.core.mapper;

import com.invoice_service.adapter.in.dto.GerarFaturaDTO;
import com.invoice_service.adapter.out.repository.entity.FaturaEntity;
import com.invoice_service.application.core.domain.Fatura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FaturaMapper {

    Fatura dtoToDomain(GerarFaturaDTO dto);
    FaturaEntity domainToEntity(Fatura fatura);
    Fatura entityToDomain(FaturaEntity entity);
}
