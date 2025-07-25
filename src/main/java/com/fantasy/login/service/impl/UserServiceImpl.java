package com.fantasy.login.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fantasy.login.domain.User;
import com.fantasy.login.mapper.UserMapper;
import com.fantasy.login.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author Fantasy
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2025-07-25 05:15:18
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




