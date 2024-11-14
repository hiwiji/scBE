-- GROUP BY
SELECT mem_id, SUM(amount * price) AS '소모비용'
FROM buy_history
GROUP BY mem_id;

SELECT mem_id, AVG(amount * price) AS '평균 소모비용'
FROM buy_history
GROUP BY mem_id;

-- HAVING
SELECT mem_id, SUM(amount * price) AS '소모비용'
FROM buy_history
GROUP BY mem_id
HAVING SUM(amount * price) > 10000; 

SELECT mem_id, group_name, SUM(amount * price) AS '소모비용'
FROM buy_history
WHERE group_name = '음료'
GROUP BY mem_id
HAVING SUM(amount * price) > 10000; 