
-- INSERT 구문
INSERT INTO member (mem_name, addr, phone, height, enroll_date)
VALUES ('John', '123 Main Street', '1234567890', 180, '2023-07-09 10:00:00' );
-- memberID는 AUTO_INCREMENT 기능으로 자동생성됨

INSERT INTO member (mem_name, addr, phone, height, enroll_date)
VALUES ('Jane', '456 Elm Street', '9876543210', 165, '2023-07-09 11:00:00' ),
		('Bob', '789 Oak Street', '5555555555', 175, '2023-07-09 12:00:00' ),
		('Alice', '321 Pine Street', '1111111111', 160, '2023-07-09 13:00:00' );

-- UPDATE구문
UPDATE member
SET addr = '456 Maple Avenue'
WHERE mem_name = 'John'; -- 조건 안넣으면 모든 내용이 수정됨


-- DELETE 구문
DELETE FROM member 
WHERE mem_name = 'Bob';

