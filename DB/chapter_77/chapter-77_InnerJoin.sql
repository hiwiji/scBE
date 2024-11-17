--  INNER JOIN
SELECT *
FROM group_singer
	JOIN buy_history
    ON buy_history.mem_id = group_singer.mem_id;
    
    
SELECT G.mem_id, G.mem_number, B.prod_name
FROM group_singer G
	JOIN buy_history B
    ON B.mem_id = G.mem_id;

-- INNER JOIN
-- 1000원 이상 물품 샀고, 소모한 비용 SUM이 5000원 넘는 그룹 중 탑3를 반환하라
SELECT G.mem_id, G.mem_name, G.mem_number, SUM(B.price) AS total_price
FROM group_singer G
	JOIN buy_history B
    ON B.mem_id = G.mem_id
WHERE B.price >= 1000
GROUP BY G.mem_id
	HAVING  total_price >= 5000
ORDER BY total_price DESC
LIMIT 3;

-- 서울/경기 출신 그룹 중, 소모한 비용 SUM이 10000원이 넘는 그룹이 몇명인지 반환해라
-- 서브쿼리를 이용해서
SELECT COUNT(*)
FROM (
	SELECT G.mem_id, G.mem_name, G.addr, SUM(B.price) AS total_price
FROM  group_singer G
	JOIN buy_history B
    ON B.mem_id = G.mem_id
WHERE G.addr in ('서울', '경기')
GROUP BY G.mem_id
	HAVING total_price > 10000
) sub;

