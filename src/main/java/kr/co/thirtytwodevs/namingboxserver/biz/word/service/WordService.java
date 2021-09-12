package kr.co.thirtytwodevs.namingboxserver.biz.word.service;

import kr.co.thirtytwodevs.namingboxserver.biz.word.repository.WordRepository;
import kr.co.thirtytwodevs.namingboxserver.biz.word.vo.WordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {

    @Autowired
    WordRepository wordRepository;


    public List<WordVO> searchWord(Pageable page, String searchCondition, String searchKeyword) {
        Page<WordVO> resultPage;

        switch (searchCondition) {
            case "name" :
                resultPage = wordRepository.findByWrdName(page,searchKeyword);
                break;
            default:
                resultPage = wordRepository.findAll(page);
        }
        return resultPage.getContent();
    }
}
