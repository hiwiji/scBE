-- ORDER BY
SELECT *
FROM group_singer
ORDER BY debut_date; 

SELECT *
FROM group_singer
WHERE mem_number <= 6
ORDER BY debut_date DESC; 


-- LIMIT
SELECT mem_name, debut_date
FROM group_singer
ORDER BY debut_date ASC
LIMIT 3;

SELECT mem_name, debut_date
FROM group_singer
WHERE mem_number < 4
ORDER BY debut_date ASC
LIMIT 0, 3; 

-- DISTINCT
SELECT DISTINCT addr
FROM group_singer
ORDER BY addr;