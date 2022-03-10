package com.kurek.antoni.pluton.portfolio;

import com.kurek.antoni.pluton.portfolio.dtos.OwnedPortfolioDto;
import com.kurek.antoni.pluton.portfolio.dtos.PortfolioInputDto;
import com.kurek.antoni.pluton.portfolio.model.Portfolio;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class Controller {
    private final Handler handler;

    @GetMapping("/portfolio/owned/{email}")
    public OwnedPortfolioDto[] getOwnedPortfolios(@PathVariable String email) {
        return handler.getOwnedPortfolios(email);
    }

    @PostMapping("/portfolio")
    public ResponseEntity<Portfolio> createPortfolio(@RequestBody PortfolioInputDto inputDto) {
        return new ResponseEntity<>(handler.createPortfolio(inputDto), HttpStatus.CREATED);
    }
}
