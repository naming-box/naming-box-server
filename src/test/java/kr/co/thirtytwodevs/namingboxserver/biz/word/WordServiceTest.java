package kr.co.thirtytwodevs.namingboxserver.biz.word;

import kr.co.thirtytwodevs.namingboxserver.biz.word.repository.WordRepository;
import kr.co.thirtytwodevs.namingboxserver.biz.word.vo.WordVO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@DataJpaTest
@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class WordServiceTest {
    @Autowired
    WordRepository wordRepository;

    @Test
    @DisplayName("단어 전체조회 ")
    public void findAll() {
        List<WordVO> list = wordRepository.findAll();
        list.forEach(System.out::println);
    }
}
