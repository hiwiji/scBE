
-- 컬럼추가
ALTER TABLE netflix_movie
ADD COLUMN release_date DATE AFTER movie_title; 
-- neflix_movie 테이블에
-- release_date를 date 타입으로 컬럼 추가하는데 
-- movie_title 다음에 추가해라

DESC netflix_movie;

-- 컬럼변경
ALTER TABLE netflix_movie
MODIFY COLUMN movie_director VARCHAR(100) NOT NULL;


-- 컬럼삭제
ALTER TABLE netflix_movie
DROP COLUMN movie_script;