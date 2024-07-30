package domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username; // 로그인에 사용하는 고유 식별자
    private String name;     // 사용자의 실제 이름
    private String password; // 암호화된 비밀번호
}
