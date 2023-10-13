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
<br>
<h4>1. 공고 등록</h4>
<img width="80%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend1/assets/139114497/136ccf4c-85f7-4efa-9792-7dbb0923b041"/>
<br>
<h4>2. 공고 수정</h4>
<img width="80%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend1/assets/139114497/acd167d6-1982-4c23-a79e-f79d4a79da85"/>
<br>
<h4>3. 공고 삭제</h4>
<img width="80%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend1/assets/139114497/d16c11f1-3bf7-467d-9f24-6dc0bf332267"/>
<br>
<h4>4. 공고 조회</h4>
<img width="50%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend1/assets/139114497/ee87047e-400e-43fc-8a1f-439a6e6ae7a4"/>
<br>
<h4>5. 공고 검색(회사명 키워드 검색)</h4>
<img width="50%" src="https://github.com/MarsGiraffe/wanted-pre-onboarding-backend1/assets/139114497/b309c169-d38b-4189-8856-af9f479410d4"/>
<br>
<h4>6. 공고 상세페이지(회시가 올린 다른 공고)</h4>
<p>
  <1>
  company 테이블
  회사명	pk
  국가
  지역
  "다른공고"
  
  - 공고 등록 시
  공고 등록 성공 시 해당 회사명의 다른공고 컬럼에 등록하는 공고ID를 추가하여 'ID01,ID02,ID03' 의 형태로 저장
  
  - 공고 상세페이지 이동 시
  해당 공고 정보와
  해당 회사의 다른 공고를 배열로 가져와 각 row를 조회하고 List에 담아 출력
  
  문제점 ) 공고가 삭제되거나 기간만료 시 공고 리스트에서는 조회할 수 없으나,
  	상세페이지 이동 시 출력됨
  
  <2>
  - 공고 상세페이지 이동 시
  클릭한 공고의 ID를 통해 해당 공고의 정보로 상세 페이지를 출력함.
  해당 공고의 회사명과 매칭되는 정보를 List에 담아 출력
</p>
