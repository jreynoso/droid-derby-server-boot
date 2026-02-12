package com.dispassionproject.droidderby.game

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class GameControllerSpec extends Specification {

    @Autowired
    MockMvc mockMvc

    def 'GET /game returns OK body'() {
        expect:
        mockMvc.perform(get('/game'))
            .andExpect(status().isOk())
            .andExpect(content().string('OK'))
    }

    def 'POST /game returns 501 not implemented'() {
        expect:
        mockMvc.perform(post('/game'))
            .andExpect(status().isNotImplemented())
    }
}
