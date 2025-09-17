package com.invoice_service.config;

import com.invoice_service.adapter.out.repository.imple.FaturaRepositoryAdapter;
import com.invoice_service.adapter.out.repository.imple.SpringFaturaRepository;
import com.invoice_service.application.core.mapper.FaturaMapper;
import com.invoice_service.application.ports.out.FaturaRepositoryOutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public FaturaRepositoryOutPort faturaRepositoryOutPort(FaturaMapper faturaMapper, SpringFaturaRepository springFaturaRepository){
        return new FaturaRepositoryAdapter(springFaturaRepository, faturaMapper);
    }
}
