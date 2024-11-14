CREATE TABLE netflix_movie(
	movie_id INT AUTO_INCREMENT PRIMARY KEY,
	movie_title VARCHAR(30) NOT NULL,
    movie_director VARCHAR(20) NOT NULL,
    movie_star VARCHAR(20) NOT NULL,
    movie_script LONGTEXT,
    movie_film LONGBLOB
);

DESC netflix_movie;