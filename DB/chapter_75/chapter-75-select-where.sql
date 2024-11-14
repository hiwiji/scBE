-- SELECT
SELECT mem_id, prod_name FROM buy_history;

SELECT *
FROM group_singer
WHERE mem_name = '블랙핑크';

SELECT *
FROM group_singer
WHERE height >= 180;

UPDATE group_singer 
SET mem_number = 6
WHERE mem_name = '몬스타엑스';

SELECT *
FROM group_singer
WHERE height > 160 AND height <= 170;

SELECT *
FROM group_singer
WHERE height BETWEEN 160 AND 170;

SELECT *
FROM group_singer
WHERE addr IN ('경기','경남');

SELECT *
FROM group_singer
WHERE mem_name LIKE '세__';

SELECT *
FROM group_singer
WHERE mem_name LIKE '세_';

SELECT *
FROM group_singer
WHERE mem_name LIKE '세%';

SELECT *
FROM group_singer
WHERE mem_name LIKE '__핑크';

SELECT *
FROM group_singer
WHERE mem_name LIKE '%핑크';