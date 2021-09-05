package kr.co.thirtytwodevs.namingboxserver.biz.word.service;

import kr.co.thirtytwodevs.namingboxserver.biz.word.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {

    @Autowired
    WordRepository wordRepository;

}
