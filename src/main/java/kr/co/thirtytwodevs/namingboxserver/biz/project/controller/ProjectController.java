package kr.co.thirtytwodevs.namingboxserver.biz.project.controller;

import kr.co.thirtytwodevs.namingboxserver.biz.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proect")
public class ProjectController {
    @Autowired
    MemberService memberService;

    @RequestMapping("/count")
    public int searchMemberCount() {
        return memberService.searchMemberCount();
    }

}
