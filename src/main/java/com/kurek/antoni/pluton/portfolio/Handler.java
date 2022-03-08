package com.kurek.antoni.pluton.portfolio;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Handler {
    private final Repository repository;

//    public Asset createAsset(UUID portfolioId, Asset asset) {
//        return this.repository.save(asset);
//    }

}
