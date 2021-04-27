package com.edu.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.edu.dao.entity.UserClassEntity;
import com.edu.dao.entity.UserEntity;
import com.edu.dao.mapper.UserClassMapper;
import com.edu.dao.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource(name = "userClassMapper")
    private UserClassMapper userClassMapper;

    public UserEntity getUser(UserEntity condition){
        Wrapper<UserEntity> wrapper = new QueryWrapper<>(condition);
        return userMapper.selectOne(wrapper);
    }

    public UserClassEntity getUserOneClass(UserClassEntity condition) {
        Wrapper<UserClassEntity> wrapper = new QueryWrapper<>(condition);
        return userClassMapper.selectOne(wrapper);
    }
    
    public List<UserClassEntity> getUserAllClass(UserClassEntity condition) {
        Wrapper<UserClassEntity> wrapper = new QueryWrapper<>(condition);
        return userClassMapper.selectList(wrapper);
    }
}
