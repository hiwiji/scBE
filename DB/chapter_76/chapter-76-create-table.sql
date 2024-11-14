-- 1:1 관계
CREATE TABLE users (
	id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(20),
    enabled Boolean
);

CREATE TABLE addresses (
	user_id INT PRIMARY KEY,
    street VARCHAR(30),
    city VARCHAR(30),
    state VARCHAR(30),
    FOREIGN KEY (user_id) REFERENCES users (id) 
);

-- 1:N 관계
CREATE TABLE reviews(
	reviews_id INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT NOT NULL,
    user_name VARCHAR(30),
    content MEDIUMTEXT,
    FOREIGN KEY (book_id) REFERENCES book (id)
);

CREATE TABLE book (
	id INT AUTO_INCREMENT PRIMARY KEY,
    book_name VARCHAR(30) NOT NULL,
    author VARCHAR(30) NOT NULL,
    content LONGTEXT
);


DESC reviews;


-- N 대 M관계
CREATE TABLE users_book_purchase(
	id INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT NOT NULL,
    user_id INT NOT NULL,
    purchase_date DATE NOT NULL,
    price INT,
    FOREIGN KEY (book_id) REFERENCES book (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);

DESC users_book_purchase;

