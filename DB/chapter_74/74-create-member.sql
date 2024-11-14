CREATE TABLE member (
member_id INT AUTO_INCREMENT PRIMARY KEY, -- MemberID는 자동으로 증강됨.
mem_name VARCHAR(10) NOT NULL,
mem_number TINYINT,
addr VARCHAR(30),
phone CHAR(12),
height TINYINT UNSIGNED,
enroll_date DATETIME
);

DESC member;