package com.edu.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.edu.dao.entity.UserEntity;
import com.edu.dao.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserService
 * @Descripion TODO
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/4/18 下午5:32
 * @Version 1.0
 **/
@Service
public class UserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public UserEntity getUser(UserEntity userCondition){
        Wrapper<UserEntity> wrapper = new QueryWrapper<>(userCondition);
        return userMapper.selectOne(wrapper);
    }
}
