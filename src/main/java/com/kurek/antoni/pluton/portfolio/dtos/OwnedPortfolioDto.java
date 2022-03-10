package com.kurek.antoni.pluton.portfolio.dtos;

import com.kurek.antoni.pluton.portfolio.model.Portfolio;

import java.util.UUID;

//todo move dtos to lib
public record OwnedPortfolioDto(String name, UUID id) {
    public OwnedPortfolioDto(Portfolio dbObject) {
        this(dbObject.name(), dbObject.id());
    }
}
