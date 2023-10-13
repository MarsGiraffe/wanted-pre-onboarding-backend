# 프리온보딩 과제
<br>
<h2> 사용 언어 </h2>
<p>
  <img src="https://img.shields.io/badge/SPRING-green?style=flat&logo=Spring&logoColor=FFFFFF"/>
  <img src="https://img.shields.io/badge/Mybatis-000000?style=flat&logo=Fluentd&logoColor=FFFFFF"/>
  <img src="https://img.shields.io/badge/ORACLE-F80000?style=flat&logo=ORACLE&logoColor=FFFFFF"/>
</p>
<h2>요구사항 분석</h2>
<img width="80%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend/assets/139114497/d1365836-b90b-444b-9e06-b351c5c1c3d8"/>
<h2>ERD설계</h2>
<img width="80%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend/assets/139114497/ad86694d-f6a0-4d0e-bd0b-672379319569"/>
<h2>기능 테스트</h2>
url에 직접적으로 query string을 전달하여 기능 작동과 DB 연동 확인
<br><br>
<h4>1. 공고 등록</h4>
<img width="80%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend1/assets/139114497/136ccf4c-85f7-4efa-9792-7dbb0923b041"/><br><br>
<h4>2. 공고 수정</h4>
<img width="80%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend1/assets/139114497/acd167d6-1982-4c23-a79e-f79d4a79da85"/><br><br>
<h4>3. 공고 삭제</h4>
<img width="80%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend1/assets/139114497/d16c11f1-3bf7-467d-9f24-6dc0bf332267"/><br><br>
<h4>4. 공고 조회</h4>
<img width="50%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend1/assets/139114497/ee87047e-400e-43fc-8a1f-439a6e6ae7a4"/><br><br>
<h4>5. 공고 검색(회사명 키워드 검색)</h4>
<<<<<<< HEAD
<img width="60%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend1/assets/139114497/b309c169-d38b-4189-8856-af9f479410d4"/><br><br>
=======
<img width="50%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend1/assets/139114497/b309c169-d38b-4189-8856-af9f479410d4"/>
<br>
>>>>>>> 6d39e169fcba394dd38ac9fb599fb685ee7adabe
<h4>6. 공고 상세페이지(회사가 올린 다른 공고)</h4>

  #1
  - company 테이블에 다른공고라는 컬럼을 추가
  - 공고 등록 시
    - 해당 회사명의 다른공고 컬럼에 등록하는 공고ID를 추가하여 'ID01,ID02,ID03' 의 형태로 저장
  - 공고 상세페이지 이동 시 
<<<<<<< HEAD
    - 해당 공고 정보와 해당 회사의 다른 공고를 배열 변환하여 각 row를 List에 담아 출력
  <br><br>
  <b>문제점 ) 공고가 삭제되거나 기간만료 시 추가적인 로직 필요</b>
  
  <b>#2</b>
  - 공고 상세페이지 이동 시
    1. 클릭한 공고의 ID를 통해 해당 공고의 정보로 상세 페이지를 출력하고 AJAX로 해당 공고의 회사명과 매칭되는 정보를 List에 담아 출력<br>(다른공고 출력 시 선택한 공고는 제외해야함)
    2. 클릭한 공고의 정보와 다른 공고를 List에 같이 담아 0번째 index는 상세정보, 나머지는 다른공고로 출력
  <br><br>
  <b>통상적으로 다른 공고는 상세페이지 하단에 위치하고 공고의 상세정보가 우선으로 로딩 되어야하기 때문에 1번으로 진행</b>
<br><br>

<h5>► 상세 페이지 출력 시</h5>
<img width="60%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend/assets/139114497/8fdf2514-3abd-4621-ae6d-608a060f185d"/>
<h5>► 다른 공고 출력 시</h5>
<img width="60%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend/assets/139114497/f7f272f6-66f3-4f07-a911-005d05b04ab4"/>
<br><br>
<h4>7. 공고 지원(중복지원 불가)</h4>
<img width="60%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend/assets/139114497/b604c997-d996-4a1c-9aa4-36b4a364d665"/>
=======
    - 해당 공고 정보와 해당 회사의 다른 공고를 배열로 가져와 각 row를 조회하고 List에 담아 출력
  <br><br>
  <b>문제점 ) 공고가 삭제되거나 기간만료 시 공고 리스트에서는 조회할 수 없으나, 상세페이지 이동 시 출력됨</b>
  
  <b>#2</b>
  - 공고 상세페이지 이동 시
    1. 클릭한 공고의 ID를 통해 해당 공고의 정보로 상세 페이지를 출력하고 AJAX로 해당 공고의 회사명과 매칭되는 정보를 List에 담아 출력<br>(선택한 공고를 제외하는 로직 필요)
    2. 클릭한 공고의 정보와 다른 공고를 List에 같이 담아 한번에 출력
  <br><br><u>통상적으로 다른 공고는 상세페이지 하단에 위치하기 때문에 1번으로 진행</u>
<br><br>
<h5>상세 페이지 출력 시</h5>
<img width="60%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend/assets/139114497/8fdf2514-3abd-4621-ae6d-608a060f185d"/>
<h5>다른 공고 출력 시</h5>
<img width="60%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend/assets/139114497/f7f272f6-66f3-4f07-a911-005d05b04ab4"/>

>>>>>>> 6d39e169fcba394dd38ac9fb599fb685ee7adabe

