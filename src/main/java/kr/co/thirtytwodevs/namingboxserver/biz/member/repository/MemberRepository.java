package kr.co.thirtytwodevs.namingboxserver.biz.member.repository;

import kr.co.thirtytwodevs.namingboxserver.biz.member.vo.MemberVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberVO, Long> {
  public int countAllBy();
}
