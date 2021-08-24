# naming_box_server

---


+ TDD 지향 프로젝트  
+ 프로젝트에서 쓰이는 약어가 어떤 단어인지를 검색하는 프로젝트의 서버


## stack  

---
- spring boot 2.5.4
- spring data jpa
- spring security
- lombok
- mariaDB 10.6.4

## function

---
- 회원가입, 로그인, 로그아웃, 정보수정
- 팀생성, 팀생성, 팀삭제, 팀초대
- 단어 그룹 생성, 수정, 삭제
- 단어 생성, 수정, 삭제, 추천

### Memo
>로그백 설정관련 -> 어펜더들을 독립적으로 두고 프로파일별 설정파일에서 각각 가져가서 선택하게 하고싶다.-> 이를위해서 Include방법을 사용해본다
