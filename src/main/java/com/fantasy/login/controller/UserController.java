package com.fantasy.login.controller;

import com.fantasy.login.domain.User;
import com.fantasy.login.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理
 */
@RestController
@RequestMapping("/user")
@Tag(name = "用户管理")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 根据 id 查询用户
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @Operation(summary = "根据 id 查询用户")
    public User getUserById(@PathVariable Integer id) {
        return userService.getById(id);
    }
}
