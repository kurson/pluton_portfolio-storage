package com.kurek.antoni.pluton.portfolio;

import com.kurek.antoni.pluton.portfolio.dtos.OwnedPortfolioDto;
import com.kurek.antoni.pluton.portfolio.model.Portfolio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Handler {
    private final Repository repository;

    public OwnedPortfolioDto[] getOwnedPortfolios(String email) {
        List<Portfolio> portfolioList = repository.findByOwnerEmail(email);
        return portfolioList.stream().map(OwnedPortfolioDto::new).toArray(OwnedPortfolioDto[]::new);
    }

//    public Asset createAsset(UUID portfolioId, Asset asset) {
//        return this.repository.save(asset);
//    }

}
