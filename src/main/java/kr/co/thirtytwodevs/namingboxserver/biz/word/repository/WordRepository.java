package kr.co.thirtytwodevs.namingboxserver.biz.word.repository;

import kr.co.thirtytwodevs.namingboxserver.biz.word.vo.WordVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<WordVO, Long> {
    Page<WordVO> findByWrdName(Pageable page, String name);
}
