package kr.co.thirtytwodevs.namingboxserver.biz.project.service;

import kr.co.thirtytwodevs.namingboxserver.biz.member.repository.MemberRepository;
import kr.co.thirtytwodevs.namingboxserver.biz.project.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public int searchProjectCount() {
        return projectRepository.countAll();
    }
}
