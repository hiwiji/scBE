-- LEFT JOIN

SELECT *
FROM group_singer
	LEFT JOIN buy_history
    ON group_singer.mem_id = buy_history.mem_id;
    
-- 구매 목록이 없는 그룹 가수에서 평균키가 큰 순서대로 3명을 반환하라
SELECT *
FROM group_singer G
	LEFT JOIN buy_history B
    ON G.mem_id = B.mem_id
WHERE B.buy_id IS NULL
ORDER BY height DESC
LIMIT 3;

-- 구매목록이 없는 그룹가수는 총 몇그룹인가?
SELECT COUNT(*)
FROM (
	SELECT G.mem_id
	FROM group_singer G
		LEFT JOIN buy_history B
		ON G.mem_id = B.mem_id
	WHERE B.buy_id IS NULL
) sub;
