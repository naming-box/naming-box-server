package kr.co.thirtytwodevs.namingboxserver.biz.word.controller;

import kr.co.thirtytwodevs.namingboxserver.biz.word.service.WordService;
import kr.co.thirtytwodevs.namingboxserver.biz.word.vo.WordVO;
import kr.co.thirtytwodevs.namingboxserver.common.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/word")
public class WordController {

    @Autowired
    WordService wordService;

    @GetMapping(value = "/word")
    public ResponseEntity<ResponseVO> searchWordList(Pageable page, @RequestParam("condition") String searchCondition, @RequestParam("keyword") String searchKeyword) {
        HttpStatus httpStatus = HttpStatus.OK;
        ResponseVO res = new ResponseVO();
        List<WordVO> data = wordService.searchWord(page, searchCondition, searchKeyword);
        res.setData(data);
        return new ResponseEntity<>(res,httpStatus);
    }
}
