package com.kurek.antoni.pluton.portfolio;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kurek.antoni.pluton.portfolio.dtos.PortfolioInputDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class WriteApiTests {
    @MockBean
    Repository repository;
    ObjectMapper mapper = new ObjectMapper();
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreatePortfolio() throws Exception {
        PortfolioInputDto inputDto = new PortfolioInputDto("My stuff2", "Stuff is good.", "a@b.c");
        //when create portfolio endpoint is called
        this.mockMvc.perform(post("/portfolio")
                                     .contentType(MediaType.APPLICATION_JSON)
                                     .content(mapper.writeValueAsString(inputDto)))
                    .andExpect(status().isCreated());
    }

//    @Test
//    void shouldSaveAsset() {
//        //given portfolio exists
//        when(repository.findById(portfolioId)).thenReturn(portfolio);
//        //when create asset endpoint is called
//        this.mockMvc.perform(post("/" + portfolioId + "/assets"))
//        //save asset to db
//    }
}
