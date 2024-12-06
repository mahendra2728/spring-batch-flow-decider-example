package com.pm.spring.batch;

import com.pm.spring.batch.mapper.UserRowMapper;
import com.pm.spring.batch.model.User;
import org.springframework.batch.item.*;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

public class UserItemReader implements ItemReader<User> {

    @Autowired
    private DataSource dataSource;

    @Override
    public User read() throws Exception {
        JdbcCursorItemReader<User> itemReader = new JdbcCursorItemReader<>();
        itemReader.setDataSource(dataSource);
        itemReader.setSql("SELECT id, address, username from users");
        itemReader.setRowMapper(new UserRowMapper());
        int counter = 0;
        ExecutionContext executionContext = new ExecutionContext();
        itemReader.open(executionContext);
        User user = new User();
        while(user != null){
            user = itemReader.read();
            counter++;
        }
        itemReader.close();
        return user;
    }
}
