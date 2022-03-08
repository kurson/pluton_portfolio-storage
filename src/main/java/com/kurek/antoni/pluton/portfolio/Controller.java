package com.kurek.antoni.pluton.portfolio;

import com.kurek.antoni.pluton.portfolio.dtos.OwnedPortfolioDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class Controller {
    @GetMapping("/ownedPortfolios/{email}")
    public OwnedPortfolioDto[] getOwnedPortfolios(@PathVariable String email) {
        OwnedPortfolioDto[] array = new OwnedPortfolioDto[1];
        array[0] = new OwnedPortfolioDto("My Stuff", UUID.randomUUID());
        return array;
    }
}
