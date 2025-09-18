package com.invoice_service.application.core.mapper;

import com.invoice_service.adapter.in.dto.GerarFaturaDTO;
import com.invoice_service.adapter.out.repository.entity.FaturaEntity;
import com.invoice_service.application.core.domain.Fatura;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface FaturaMapper {

    Fatura dtoToDomain(GerarFaturaDTO dto);

    FaturaEntity domainToEntity(Fatura fatura);
}
