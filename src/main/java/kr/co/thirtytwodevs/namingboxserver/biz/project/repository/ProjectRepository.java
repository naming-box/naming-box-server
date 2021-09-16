package kr.co.thirtytwodevs.namingboxserver.biz.project.repository;

import kr.co.thirtytwodevs.namingboxserver.biz.project.vo.ProjectVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectVO, Long> {
    int countAll();
}
