package org.example.jdbc;

import java.sql.*;

public class jdbcTest {

    /** 요구사항
     * 1. 1000원 이상 산 group singer를 구하는 SELECT문을 JDBC로 실행해보자
     * 2. Group_singer에 새로운 singer "르세라핌"을 넣어 insert문을 jdbc로 실행해보자.
     */

    // private static final String DB_URL = "jdbc:mysql://localhost:3306/chapter_78?useUnicode=true&characterEncoding=UTF-8";

    // 1. RDB, mySQL 접근 정보, 권한 적기
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chapter_78";
    // private static final String DB_URL = "jdbc:mysql://localhost:3306/chapter_78?useUnicode=true&characterEncoding=UTF-8";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12341234";
    
    public static void main(String[] args) throws SQLException {
        // 2. jdbc 연결하기

        // 2-1 Connection 생성, Connection Close
        // try-catch문으로 작성해서 Connection은 try() 안에 넣는다.
        // 조건구문을 try() '{}' 중괄호 안에 넣기

        try(Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); // DB랑 연결하고
            Statement statement = connection.createStatement() // SQL 보낼준비
        ) {

            // 3. SQL문 입력(SELECT) : 1000원 이상 산 group singer를 구하는 SELECT문을 JDBC로 실행해보자
            String stringSQL = "SELECT *\n" +
                    "FROM group_singer G\n" +
                    "\tJOIN buy_history_1 B \n" +
                    "    ON G.mem_id = B.mem_id \n" +
                    "WHERE price > 1000;";

            ResultSet resultSet = statement.executeQuery(stringSQL); // ResultSet으로 결과를 받음

            // 4. while문으로 resultSet으로 결과 확인
            // next로 하면 false가 되면서 한줄한줄씩 해서 true가 될 때까지 확인
            // 출력할 데이터값에 맞춰 가져요기
            while(resultSet.next()) {
                String memId = resultSet.getString("mem_id");
                String memName = resultSet.getString("mem_name");
                long price = resultSet.getLong("price");

                System.out.println("mem_id: " + memId + ", mem_name: " + memName + ", price: " + price);
            }

                // 3. SQL문 입력(INSERT) : Group_singer에 새로운 singer "르세라핌"을 넣어 insert문을 jdbc로 실행해보자.
                String stringSQL2 = "INSERT INTO group_singer(mem_id, mem_name, mem_number, addr, phone, height, debut_date)" +
                        "VALUES ('M1212','르세라핌', 5, '서울', 01012345678, 172, '2022-12-06');";

                statement.executeUpdate(stringSQL2);


        } catch (SQLException e) {
            e.printStackTrace();
        } ;
    }
}
