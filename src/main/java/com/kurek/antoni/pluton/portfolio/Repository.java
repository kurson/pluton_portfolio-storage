package com.kurek.antoni.pluton.portfolio;

import com.kurek.antoni.pluton.portfolio.model.Portfolio;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface Repository extends MongoRepository<Portfolio, UUID> {
}
