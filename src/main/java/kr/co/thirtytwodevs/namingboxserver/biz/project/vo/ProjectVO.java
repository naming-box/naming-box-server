package kr.co.thirtytwodevs.namingboxserver.biz.project.vo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="project")
public class ProjectVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long prgId;

    String prgType;

    String prgName;

    @Builder
    public ProjectVO(long prgId, String prgType, String prgName) {
        this.prgId = prgId;
        this.prgType = prgType;
        this.prgName = prgName;
    }
}
