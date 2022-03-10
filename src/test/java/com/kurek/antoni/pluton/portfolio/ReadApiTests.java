package com.kurek.antoni.pluton.portfolio;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kurek.antoni.pluton.portfolio.dtos.OwnedPortfolioDto;
import com.kurek.antoni.pluton.portfolio.model.Portfolio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ReadApiTests {
    @MockBean
    Repository repository;
    ObjectMapper mapper = new ObjectMapper();
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnOwnedPortfolio() throws Exception {
        //given portfolio exists
        String email = "jdog@mail.co";
        Portfolio portfolio = new Portfolio("My stuff", email);
        when(repository.findByOwnerEmail(email)).thenReturn(List.of(portfolio));
        //when get owned portfolio endpoint is called
        //then return array of 1
        this.mockMvc.perform(get("/portfolio/owned/" + email))
                    .andExpect(status().isOk())
                    .andExpect(content().json(mapper.writeValueAsString(new OwnedPortfolioDto[]{new OwnedPortfolioDto(
                            portfolio)})));
    }
}
