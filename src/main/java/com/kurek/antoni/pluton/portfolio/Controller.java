package com.kurek.antoni.pluton.portfolio;

import com.kurek.antoni.pluton.portfolio.dtos.OwnedPortfolioDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {
    private final Handler handler;

    @GetMapping("/portfolio/owned/{email}")
    public OwnedPortfolioDto[] getOwnedPortfolios(@PathVariable String email) {
        return handler.getOwnedPortfolios(email);
    }
}
