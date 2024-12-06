package com.pm.spring.batch.mapper;

import com.pm.spring.batch.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setAddress(resultSet.getString("address"));
        user.setUsername(resultSet.getString("username"));
        return user;
    }
}
