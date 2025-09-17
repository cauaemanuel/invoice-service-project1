package com.invoice_service.adapter.out.repository.imple;

import com.invoice_service.adapter.out.repository.entity.FaturaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SpringFaturaRepository extends MongoRepository<FaturaEntity, UUID> {
}
