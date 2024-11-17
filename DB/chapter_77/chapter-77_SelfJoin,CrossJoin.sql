-- SELF JOIN
SELECT *
FROM employee E1
	LEFT JOIN employee E2
    ON E1.manager_id = E2. employee_id;
    
-- CROSS JOIN
SELECT *
FROM group_singer G
	CROSS JOIN buy_history B;
   