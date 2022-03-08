package com.kurek.antoni.pluton.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class WriteApiTests {
    @MockBean
    Repository repository;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldSaveAsset() {
        //given portfolio exists
        //when(repository.findById(portfolioId)).thenReturn(portfolio);
        //when create asset endpoint is called
        //this.mockMvc.perform(post("/" + portfolioId + "/assets"))
        //save asset to db
    }

}
