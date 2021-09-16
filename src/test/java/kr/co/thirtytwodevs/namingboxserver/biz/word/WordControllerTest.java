package kr.co.thirtytwodevs.namingboxserver.biz.word;

import kr.co.thirtytwodevs.namingboxserver.biz.word.controller.WordController;
import kr.co.thirtytwodevs.namingboxserver.biz.word.service.WordService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
public class WordControllerTest {

    @Autowired
    MockMvc mvc;


    @Test
    public void searchWordListNoParameter() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/word"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest())
                .andDo(MockMvcResultHandlers.print());
    }

}
