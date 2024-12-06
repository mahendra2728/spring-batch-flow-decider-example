package com.pm.spring.batch;

import com.pm.spring.batch.model.User;
import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User,User> {

    @Override
    public User process(User user) throws Exception {
        System.out.println("In Processor User is >>> "+user.toString());
        return user;
    }
}
