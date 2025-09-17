package com.invoice_service.application.core.usecase;

import com.invoice_service.adapter.in.dto.GerarFaturaDTO;
import com.invoice_service.application.core.mapper.FaturaMapper;
import com.invoice_service.application.ports.out.FaturaRepositoryOutPort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GerarFaturaUseCaseTest {

    @InjectMocks
    private GerarFaturaUseCase gerarFaturaUseCase;
    @Mock
    private FaturaRepositoryOutPort faturaRepository;
    @Mock
    private FaturaMapper faturaMapper;

    @Test
    void deveLancarExceptionSeQuantiaForMenorQueZero(){
        var dto = new GerarFaturaDTO(0.0, LocalDate.now(), "1240594949");
        assertThrows(IllegalArgumentException.class, () -> gerarFaturaUseCase.gerarFatura(dto));
    }

}