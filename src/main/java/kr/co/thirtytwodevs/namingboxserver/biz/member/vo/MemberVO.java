package kr.co.thirtytwodevs.namingboxserver.biz.member.vo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="member")
public class MemberVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String type;

    String email;

    String password;

    String nickName;

    @Builder
    public MemberVO(long id, String type, String email, String password, String nickName) {
        this.id = id;
        this.type = type;
        this.email = email;
        this.password = password;
        this.nickName = nickName;
    }


}
