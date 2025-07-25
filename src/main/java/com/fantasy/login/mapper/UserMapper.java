package com.fantasy.login.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fantasy.login.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Fantasy
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2025-07-25 05:15:18
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




