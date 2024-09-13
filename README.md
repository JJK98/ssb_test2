## 1차 요구사항 구현
- [X] 유저가 루트 url로 접속시에 게시글 리스트 페이지(http://주소:포트/article/list)가 나온다.
- [X] 리스트 페이지에서는 등록 버튼이 있고 버튼을 누르면 http://주소:포트/article/create 경로로 이동하고 등록 폼이 나온다.
- [X] 게시글 등록을 하면 http://주소:포트/article/create로 POST 요청을 보내어 DB에 해당 내용을 저장한다.
- [X] 게시글 등록이 되면 해당 게시글 리스트 페이지로 리다이렉트 된다. 페이지 URL 은 http://주소:포트/article/list 이다.
- [X] 리스트 페이지에서 해당 게시글을 클릭하면 상세페이지로 이동한다. 해당 경로는 http://주소:포트/article/detail/{id} 가 된다.
- [X] 게시글 상세 페이지에는 id에 맞는 게시글 데이터와 목록 버튼이 있다. 목록 버튼을 누르면 게시글 리스트 페이지로 이동하게 된다.

- article 등록 버튼고 목록버튼이 부트스랩 디자인으로 생성되었다.

## 미비사항 or 막힌 부분
- HTML에 article_form과 article_detail부분

## UI/UX
![image](https://github.com/user-attachments/assets/c5cec25f-b9c6-4581-81a0-97c0f018cced)


![image](https://github.com/user-attachments/assets/2140ed70-a5e2-4c60-b378-7885f181bab8)


![image](https://github.com/user-attachments/assets/185b8e12-5f30-4a99-9495-6762d5cd52ff)


## MVC 패턴
- ...

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- ...

## JPA의 장점과 단점
- ...

## HTTP GET 요청과 POST 요청의 차이
- ...
