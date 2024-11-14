INSERT INTO book(book_name, author, content)
VALUES ('백설공주', '그림형제','잘 살았습니다~~');

INSERT INTO users(user_name, enabled)
VALUES ('이순신', true);

INSERT INTO users(user_name, enabled)
VALUES ('아이유', true);


-- 정상 실행 --
INSERT INTO users_book_purchase(book_id, user_id, purchase_date, price)
VALUES (1,1,'2023-07-07', 1000);

-- 실행되지 않음 --
INSERT INTO users_book_purchase(book_id, user_id, purchase_date, price)
VALUES (1,2,'2023-07-07', 1000);

--   > book_id는 1이 있는데, user_id 는 1이 없어서 나는 오류
