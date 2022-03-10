package com.kurek.antoni.pluton.portfolio.model;

import com.kurek.antoni.pluton.portfolio.dtos.PortfolioInputDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
import java.util.UUID;

@Document
public record Portfolio(@Id UUID id,
                        String name,
                        String description,
                        String ownerEmail,
                        Map<Integer, Asset> assets) {
    public Portfolio(String name, String ownerEmail) {
        this(UUID.randomUUID(), name, "", ownerEmail, null);
    }

    public Portfolio(PortfolioInputDto inputDto) {
        this(UUID.randomUUID(), inputDto.name(), inputDto.description(), inputDto.ownerEmail(), null);
    }
}
