package kr.co.thirtytwodevs.namingboxserver.biz.word.vo;

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
@Entity(name="word")
public class WordVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long wrdId;
    long wrgId;
    long prgId;
    String wrdType;
    String wrdText;
    String wrdName;
    String wrdDesc;

    @Builder
    public WordVO(long wrdId, long wrgId, long prgId, String wrdType, String wrdText, String wrdName) {
        this.wrdId = wrdId;
        this.wrgId = wrgId;
        this.prgId = prgId;
        this.wrdType = wrdType;
        this.wrdText = wrdText;
        this.wrdName = wrdName;
    }


}
