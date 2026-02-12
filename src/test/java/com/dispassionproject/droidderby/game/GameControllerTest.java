package com.dispassionproject.droidderby.game;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class GameControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getGameReturnsOkBody() throws Exception {
        mockMvc.perform(get("/game"))
                .andExpect(status().isOk())
                .andExpect(content().string("OK"));
    }

    @Test
    void postGameReturnsNotImplemented() throws Exception {
        mockMvc.perform(post("/game"))
                .andExpect(status().isNotImplemented());
    }
}
