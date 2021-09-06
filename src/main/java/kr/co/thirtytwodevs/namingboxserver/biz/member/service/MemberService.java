package kr.co.thirtytwodevs.namingboxserver.biz.member.service;

import kr.co.thirtytwodevs.namingboxserver.biz.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public int searchMemberCount() {
        return memberRepository.countAllBy();
    }
}
