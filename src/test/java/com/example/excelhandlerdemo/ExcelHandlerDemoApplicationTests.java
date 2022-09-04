package com.example.excelhandlerdemo;

import com.example.excelhandlerdemo.dao.UserMapper;
import com.example.excelhandlerdemo.entity.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@SpringBootTest
class ExcelHandlerDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelectUser() {
        List<User> userList = userMapper.selectAll();
        System.out.println(userList);
    }

}
