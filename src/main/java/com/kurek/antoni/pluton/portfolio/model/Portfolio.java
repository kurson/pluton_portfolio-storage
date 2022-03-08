package com.kurek.antoni.pluton.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
import java.util.UUID;

@Document
public record Portfolio(@Id UUID id,
                        String name,
                        String description,
                        Map<Integer, Asset> assets) {
}
