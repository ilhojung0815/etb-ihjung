<img src="https://capsule-render.vercel.app/api?type=wave&color=auto&height=300&section=header&text=잔이비어&fontSize=90" />


# 1. 소개
#### 잔이비어는 맥주에 관심이 있고 맥주에 관한 정보를 얻을수 있게하기 위해 만들어진 커뮤니티로서, 맥주에 대한 정보 및 상품리뷰를 확인할 수 있는 Beer페이지, 맥주와 관련된 내용을 얘기하고 토론등을 할 수 있는 자유게시판 그리고 관련 모임을 위한 모임게시판이 있는 Community페이지, 맥주와 관련된 축제를 확인하기 위한 Festival페이지등으로 구성

# 2. 인원 및 주요업무
### 총원: 3명(프론트앤드: 1명, 백엔드: 2명)

🐻 ilhojung0815(me)   -  백엔드, Festival페이지 및 관리자 페이지 파트 Beer, Festival 구축 
<br>
😺 xowoony(leader)   -  프론트엔드, 회원가입, 로그인, Beer페이지, 마이페이지 구축 및 잔이비어 프로젝트 디자인 및 구성 총괄
<br>
🐰 riverwings   -  백엔드, Community페이지, Review파트 및 관리자 페이지 파트 Community 구축

# 3. 기술 스택
### Backend: <img height="18px" src="https://img.shields.io/badge/Java-blue">
### Frontend: <img height="18px" src="https://img.shields.io/badge/HTML-orange"> <img height="18px" src="https://img.shields.io/badge/CSS-red"> <img height="18px" src="https://img.shields.io/badge/JavaScript-yellow">
### DB: <img height="18px" src="https://img.shields.io/badge/MariaDB-9cf">
### Framework: <img height="18px" src="https://img.shields.io/badge/SpringBoot-green"> <img height="18px" src="https://img.shields.io/badge/MyBatis-black">
### Devops: <img height="18px" src="https://img.shields.io/badge/GitHub-black"> <img height="18px" src="https://img.shields.io/badge/AWS-orange">
### Api & Tool: <img height="18px" src="https://img.shields.io/badge/Kakaomap-yellow"> <img height="18px" src="https://img.shields.io/badge/CKEditor-blue">
# 4. 구조 

### Structure
![image](https://user-images.githubusercontent.com/58130791/215668053-02790e1c-d82c-4ac2-aab0-6293657db458.png)

#### Front
![image](https://user-images.githubusercontent.com/58130791/215668232-4d163192-8232-4f72-adc0-87844b75e635.png)


#### Back
![image](https://user-images.githubusercontent.com/58130791/215668373-d0d3f725-a779-440c-9eb2-296f17dab06b.png)
<br><br>



### ERD
![image](https://user-images.githubusercontent.com/58130791/215669535-02d67342-3da3-455b-9ca7-89b88826fef6.png)
<br><br><br>




# 5. 주요기능 설명 및 시연
:books: <a><b>주요 기능 및 본인이 담당한 부분(🐻로 표시)을 설명</a><br><br>

### Home
:pencil2: <a><b>잔이비어 접속시 가장 먼저 표시되는 페이지</a><br><br>
  ![Home](https://user-images.githubusercontent.com/58130791/215678052-91c93c73-1753-4ef4-8bd8-09ba8049cb02.gif)
  <br><br><br>

### PRODUCT
:pencil2: <a><b>맥주에 대한 정보 및 리뷰를 표시하는 페이지</a><br><br>
<a><b>Beer</a><br>
![beer](https://user-images.githubusercontent.com/58130791/215682753-e376eabf-5d8c-4a51-9d76-2a55be7c30a5.gif) 
<br><br>
:pushpin:
<br><span>맥주에 관한 정보를 확인할 수 있는 페이지로, 국내맥주, 해외맥주로 구분하여 확인이 가능.</span>
<br><span>각 맥주들을 클릭시 맥주를 확인할 수 있는 페이지로 이동하여 제조사, 용량, 도수, 카테고리 같은 옵션들을 확인가능</span>
<br><span>아래에는 리뷰를 작성할 수 있는 기능이 존재하며 추천, 별점을 주는 것도 가능</span>
<br><br><br>
  
<a><b>Review</a><br>
![review](https://user-images.githubusercontent.com/58130791/215682785-8d4665fb-362d-499d-8c7b-3da681a9c0d3.gif)
<br><br>
:pushpin:
<br><span>모든 맥주들의 리뷰를 확인할 수 있는 페이지,</span>
<br><span>리뷰작성시 Beer페이지로 리다이렉딩하여 해당하는 맥주를 선택하여 리뷰를 작성</span>
<br><br><br>

### COMMUNITY
:pencil2: <a><b>맥주에 관한 다양한 소통을 나누는 커뮤니티 페이지</a><br><br>
![community](https://user-images.githubusercontent.com/58130791/215684752-f41f4a16-21db-4de3-b3e8-1f11a96bf5e2.gif)
<br><br>
:pushpin:
<br><span>맥주에 대한 자유로운 소통을 나눌 수 있는 자유게시판과 맥주 관련 모임에 관해 소통을 나눌 수 있는 모임게시판이 존재</span>
<br><br><br>

### FESTIVAL(🐻)
:pencil2: <a><b>맥주 축제에 관한 정보 및 리뷰를 확인할 수 있는 페이지</a><br><br>
<a><b>Festival</a><br>
    ![festival](https://user-images.githubusercontent.com/58130791/215686466-a6155329-d5e0-4c49-b179-dd371faf9285.gif)
<br><br>
:pushpin:
<br><span>관리자 페이지를 통해 등록된 정보 확인, 해당 축제에 관한 리뷰작성, 카카오맵 API를 이용하여 MAP표시 기능등을 구현</span>
<br><br><br>

:blue_book: <a><br>Festival의 Comment관련 입력, 수정, 삭제</a><br><br>
<a><b>Festival-insert</a><br>
    ![festival_input](https://user-images.githubusercontent.com/58130791/215686681-3172084a-d0ed-4e72-b0e7-d473b3aebdb2.gif)
<br><br><br>

  
<a><b>Festival-modify</a><br>
![festival_update](https://user-images.githubusercontent.com/58130791/215688591-98b8afa7-249d-477c-b7ff-0d9717d70c1f.gif)
<br><br><br>
   


<a><b>Festival-delete</a><br>
![festival_delete](https://user-images.githubusercontent.com/58130791/215688685-7133ea9d-11d1-4488-a742-86d9efc66f23.gif)
<br><br><br><br>


### ADMIN (FESTIVAL & BEER)(🐻)
:pencil2: <a><b>관리자 페이지</a><br><br>
<a><b>Admin(Festival)</a><br>
    ![admin_festival](https://user-images.githubusercontent.com/58130791/220704496-0e22dd1a-3427-41d4-9ab4-9a9adba62979.gif)
<br><br>
:pushpin:
<br><span>맥주 축제 등록,수정,삭제 등 작업을 하기 위한 관리자페이지</span>
<br><br><br>

:blue_book: <a><br>맥주 축제 등록,수정,삭제</a><br><br>
<a><b>Admin(Festival-insert)</a><br>
    ![festival_input](https://user-images.githubusercontent.com/58130791/220705030-9005f83c-a92c-4a85-807d-054de4a1b2b1.gif)
<br><br><br>

  
<a><b>Admin(Festival-modify & Festival-delete)</a><br>
![festival_modify](https://user-images.githubusercontent.com/58130791/220705323-b5cb89f1-cd42-4ba5-bd62-dd0ae2b0c8a5.gif)
<br><br><br>
   
![festival_delete](https://user-images.githubusercontent.com/58130791/220705378-7bef17a1-3c89-4105-aa0f-607c5460ef99.gif)
<br><br><br><br>
  
  
 <a><b>Admin(Beer)</a><br>
   ![admin_beer](https://user-images.githubusercontent.com/58130791/220706457-f35a8a6f-45dd-41fe-84dc-664271a7d89b.gif)
<br><br>
:pushpin:
<br><span>맥주에 대한 정보를 등록,수정,삭제 등 작업을 하기 위한 관리자페이지</span>
<br><br><br>

:blue_book: <a><br>맥주 축제 등록,수정,삭제</a><br><br>
<a><b>Admin(Beer-insert)</a><br>
    ![beer_input](https://user-images.githubusercontent.com/58130791/220706741-a8481e6f-4705-45ed-96f6-62ee5e874cd0.gif)
<br><br><br>

  
<a><b>Admin(Beer-modify & Beer-delete)</a><br>
![beer_modify delete](https://user-images.githubusercontent.com/58130791/220706571-9c12c756-d327-42bd-bc33-fa2297dad9a3.gif)
<br><br><br><br>
 

# 6. 주요 이슈 및 해결책
  
🔍 modify form태그 오류

🐛 댓글 수정에 관한 작업을 진행하는 중 수정클릭시 작동이 제대로 되지 않은 오류 발생
   

💡 한 페이지에서 입력과 수정에 관한 submit이 2개가 존재하여 발생하였으며, action을 다른 위치로 지정하여 수정을 하는 방식을 채택, 수정 후 정상 작동하였다.

<br><br>

🔍 이미지 송수신 문제(festival, festivalAdminFestivalWrite)

🐛 이미지가 정상적으로 송수신이 되지 않은 오류 발생
   

💡 

1. festival 페이지에 서버단의 데이터들을 가져오던 중 다른 데이터들은 성공적으로 수신 되었으나, image는 정상적으로 페이지에 표기되지 않았는데 이에 대한 몇 가지 원인을 발견하였다.

        (1). image entity를 지정하지 않고 festival article entity 하나만을 이용하여 이미지를 불러오려 하였다

        (2). image entity를 지정 후 이미지는 출력이 되었으나, 하나의 이미지만 중복해서 출력이 되었는데,
	 이는 index 없이 이미지를 출력하였기에 가장 먼저 출력된 이미지만 중복해서 나오게 되었다. 

        (3). 즉 다시 말하면, festivalArticle과 image 사이의 연결점이 하나도 없었기에 발생한 문제였다.
	 이를 확인하고 image에 index라는 연결점을 추가한 결과 해당 문제가 해결하였다.

  <br><br><br>
 
2. 관리자페이지(admin)에서 이미지를 서버로 업로드 하는 과정에서 오류가 발생, 확인한 결과 Front단과 Back단에서 이미지를 주고받을 때 Front에서는 하나의 파일만 전송하도록 되어있었으나 Back에서는 MultipartFile[] 같은 배열형태로 타입형태가 일치하지 않아 발생한 오류였다. 
이를 수정한 뒤 RequestParm의 value명과 entity 변수명이 동일한 것을 발견한 다음 다시 수정하였고, 이미지가 정상적으로 업로드 되었다.

<br><br>



🔍 관리자 권한시 댓글 수정 삭제 관련(festivalRead)

🐛 관리자아이디로 접속 시 Festival 관련 댓글을 수정 및 삭제할 수 있게 하였으나 기능이 정상적으로 작동하지 않음.

💡 먼저 초기에는 수정, 삭제에 관리자 권한을 부여하는 구문을 
"session.user != null && session.user.getEmail().equals(festivalComment.getUserEmail()) ||session.user.getEmail().equals(관리자ID)" 라고 생각을 하였으나, 로그인시 페이지에서 기능이 정상적으로 작동하였으나 로그인을 하지 않고 접근시 페이지에서 오류가 발생하였다.
문제해결책을 찾는 중 팀원의 조언에 따라 session.user != null을 하나 더 추가를 하였더니 정상적으로 작동하였다.<br>
	
   오류의 원인을 분석해본 결과 session.user.getEmail.equals(관리자ID)의 반환값에서 발생한 문제였었다. 기존 참, 거짓을 확인하기 위해서는 0, 그 이외의 수로 참, 거짓을 판별하나,
   session.user.getEmail.equals()에서 어떠한 ID도 접속이 되지 않았을 시 null값이 반환이 되어서 발생한문제였다. <br>

   다른 이메일로 접속시에는 '1 || null'이 되어 참이 되어 실행이 되었으나, 접속하지 않을 시 '0 || null'이 수행이 되어 실행이 되지 않았던 것이다.
   이를 "session.user.getEmail().equals(관리자ID)"비교문에 session.user != null을 하나 더 추가 해주면서, `1 || 0` `0 || 0` 같은 로직이 되면서 오류도 해결하고 기능도 정상적으로 작동하였다.
<br><br>

🔍 Git, Github 연동과정 혼선 문제

🐛 Github를 팀원들과 같이 사용할 때 commit에서 충돌이 발생

💡 확인 해 본 결과 동일 Controller를 동시에 작업한 결과 오류가 발생하였다. 
   이에 대해 팀원들과 상의 후 각각 담당하는 작업물을 정한 뒤 작업 후 다음 작업으로 넘어갈 시 이에 대해 통보하여 충돌을 최소한으로 방지하고 함.
   추후 commit관련 충둘은 발생하지 않음
<br><br>

# 7. 마치며
