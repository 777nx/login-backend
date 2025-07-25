package com.fantasy.login.service;

import com.fantasy.login.domain.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

    @Resource
    private UserService userService;

    /**
     * 根据 id 获取用户信息
     */
    @Test
    void getUserById() {
        User user = userService.getById(1);
        System.out.println(user);
    }
}
