package com.github.supercoding.repository.users;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserJdbcTemplateDao implements UserRepository {
    // implements 써서 레포지토리랑 연결해주고 빨간줄 뜨면 implement해서 아래 메서드 만들기
    
    // jdbc 객체 만들기
    private JdbcTemplate jdbcTemplate;

    // Row Mapper로 userEntity  구현
    static RowMapper<UserEntity> userEntityRowMapper = ((rs, rowNums) ->
            new UserEntity(
                    rs.getInt("user_id"),
                    rs.getNString("user_name"),
                    rs.getNString("like_travel_place"),
                    rs.getNString("phone_num")
            ));

    // jdbc 만든 객체 생성자 만든 후 Bean넣어주기 안에("여기들어가는건 ") config 등록한거
    public UserJdbcTemplateDao(@Qualifier("jdbcTemplate2") JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public Optional<UserEntity> findUserById(Integer userId) {
        try {
            return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM users WHERE user_id = ?", userEntityRowMapper, userId));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
