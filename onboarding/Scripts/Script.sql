-- 테이블 생성
CREATE TABLE company(
	company_name varchar2(50) PRIMARY key,
	nation varchar2(50),
	region varchar2(50)
);
CREATE TABLE user_information(
	user_id NUMBER PRIMARY KEY,
	user_name varchar2(50)
);
CREATE TABLE announcement(
	ann_id varchar2(30) PRIMARY key,
	company_name varchar2(50),
	ann_info varchar2(1000),
	positions varchar2(200),
	compensation NUMBER,
	using_skill varchar2(200),
	FOREIGN KEY (company_name) REFERENCES company(company_name) ON DELETE CASCADE
);
CREATE TABLE apply_history(
	user_id NUMBER,
	ann_id varchar2(30),
	FOREIGN KEY (user_id) REFERENCES user_information(user_id) ON DELETE CASCADE,
	FOREIGN KEY (ann_id) REFERENCES announcement(ann_id) ON DELETE CASCADE
);

-- 임시 데이터
INSERT ALL
INTO company VALUES ('삼성전자','한국','서울')
INTO company VALUES ('넥슨','한국','제주')
INTO company VALUES ('네이버','한국','서울')
SELECT * FROM dual;

INSERT ALL
INTO user_information VALUES (1,'김동현')
INTO user_information VALUES (2,'박정호')
INTO user_information VALUES (3,'홍지훈')
SELECT * FROM dual;

INSERT INTO ANNOUNCEMENT VALUES 
('AN001','삼성전자','신입 java 개발자 채용합니다.','백엔드 개발자',1000000,'JAVA,SPRING,ORACLE');

SELECT * FROM ANNOUNCEMENT a ORDER BY ANN_ID ;

UPDATE ANNOUNCEMENT 
	SET COMPANY_NAME = '네이버',
		ANN_INFO = '',
		POSITIONS = '',
		COMPENSATION = 0,
		USING_SKILL = ''
	WHERE ann_id = 'AN002';

SELECT a.*, c.NATION, c.REGION  
FROM ANNOUNCEMENT a, COMPANY c 
WHERE a.COMPANY_NAME = c.COMPANY_NAME 
AND a.COMPANY_NAME like '%%'
ORDER BY ANN_ID;

DELETE announcement WHERE ann_id = 'AN010';
