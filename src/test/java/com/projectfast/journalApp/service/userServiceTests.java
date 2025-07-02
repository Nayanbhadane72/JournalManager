package com.projectfast.journalApp.service;

import com.projectfast.journalApp.Repositary.UserRepositary;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class userServiceTests {

    @Autowired
    private UserRepositary userRepositary;

    @Test
    public void testFindByUserName(){
       assertNotNull(userRepositary.findByUserName("ram"));
    }
}
