-- 1000원 이상 산 group singer를 구하는 SELECT문을 JDBC로 실행해보자
SELECT *
FROM group_singer G
	JOIN buy_history_1 B 
    ON G.mem_id = B.mem_id 
WHERE price > 1000;

--  Group_singer에 새로운 singer "르세라핌"을 넣어 insert문을 jdbc로 실행해보자.
INSERT INTO group_singer (mem_id, mem_name, mem_number, addr, phone, height, debut_date) 
		VALUES ('M1212','르세라핌', 5, '서울', 01012345678, 172, '2022-12-06');
        
        
DELETE FROM group_singer
WHERE mem_id = 'mem912';