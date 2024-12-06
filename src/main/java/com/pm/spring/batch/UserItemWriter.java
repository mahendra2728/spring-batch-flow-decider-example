package com.pm.spring.batch;

import com.pm.spring.batch.model.User;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class UserItemWriter implements ItemWriter<User> {
    @Override
    public void write(List<? extends User> users) throws Exception {

        users.forEach(user -> {
            System.out.println(" In Writer User is <><><> "+user.toString());
       });
    }

//    @Override
//    public void write(Chunk<? extends User> users) throws Exception {
//
//        users.forEach(user -> {
//            System.out.println(" In Writer User is <><><> "+user.toString());
//        });
//
//    }
}
