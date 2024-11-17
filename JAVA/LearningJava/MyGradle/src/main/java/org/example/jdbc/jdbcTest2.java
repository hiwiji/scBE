package org.example.jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class jdbcTest2 {

    // 1. RDB, mySQL 접근 정보, 권한 적기
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chapter_80";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12341234";
    
    public static void main(String[] args) throws SQLException {

        // PreparedStatement는 미리 정의된걸 만들어놔야 되기 때문에 try문 실행되기 전에 sql문 만든다.
        // 2. TODO : 동적 SQL 구문 정의 (?)로 쿼리문?
        String sqlQuery1 = "SELECT user_id, user_name, like_trabel_place" +
                            "FROM users " +
                              "WHERE user_name = ?";

        String sqlQuery2 = "SELECT ticket_type, departure_loc, arrival_loc, departure_at, return_at " +
                            "FROM airline_ticket" +
                            " WHERE departure_loc = '서울' AND ticket_type = '왕복' AND arrival_loc = ? " +
                            " ORDER BY total_price";

        System.out.println("유저 이름을 입력해주세요~");
        Scanner scanner = new Scanner(System.in); // 스캐너에서 받아서
        String userName = scanner.nextLine(); // 유저이름을 얻어서

        try(Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); // DB랑 연결하고
            PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery1);
            PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery2);
        ) {

            // sql구문 '?' 에서 Scanner 통해 콘솔에서 입력한 userName이 여기에 들어감
            preparedStatement1.setString(1, userName);
            ResultSet reseltSet = preparedStatement1.executeQuery();

            String place =  null;

            if (reseltSet.next()) {
                place = reseltSet.getNString("like_travel_place"); // NString이 varchar임
            }

            // 3. TODO : userName 으로 선호하는 곳 동적으로 질의하기
            Optional<String> likeTravelPlace = Optional.ofNullable(place);
            String likePlace = likeTravelPlace.orElseThrow(() -> new RuntimeException());
            System.out.println("선호하는 곳은 '" + likePlace + "'");

            // TODO : 얻어낸 'likePlace'로 항공권 동적으로 질의하기
            preparedStatement2.setString (1, likePlace);
            ResultSet resultSet2 = preparedStatement2.executeQuery();

            while(resultSet2.next()) {
                String ticketType = resultSet2.getNString("ticket_type");
                String departureLoc = resultSet2.getString("departure_loc");
                LocalDate departureAt = resultSet2.getDate("departure_at").toLocalDate();
                String arrivalLoc = resultSet2.getString("arrival_loc");
                LocalDate arrivalAt = resultSet2.getDate("return_at").toLocalDate();

                System.out.println("type: " + ticketType + ", 출발지: " + departureLoc + ", 도착지: " + arrivalLoc
                                    + ", 출국시간 : " + departureAt + ", 출국장소: " + arrivalAt);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } ;
    }
}




