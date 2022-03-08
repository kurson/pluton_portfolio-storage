package com.kurek.antoni.pluton.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
public record Asset(@Id String id,
                    Integer orderId,
                    String name,
                    String description,
                    BigDecimal quantity,
                    AssetType type,
                    BigDecimal pricePerUnit) {
}
