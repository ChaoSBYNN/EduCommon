package com.edu.service;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.edu.dao.entity.UserEntity;
import com.edu.dao.entity.UserScheduleEntity;
import com.edu.dao.mapper.UserScheduleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserScheduleService
 * @Descripion TODO
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/5/2 下午12:46
 * @Version 1.0
 **/
@Service
public class UserScheduleService {

    @Resource(name = "userScheduleMapper")
    private UserScheduleMapper userScheduleMapper;

    public int checkIn(UserScheduleEntity checkin) {
        return userScheduleMapper.updateById(checkin);
    }

    public int create(UserScheduleEntity create) {
        return userScheduleMapper.insert(create);
    }

    public List<UserScheduleEntity> getAll(UserScheduleEntity query) {
        Wrapper<UserScheduleEntity> wrapper = new QueryWrapper<>(query);
        return userScheduleMapper.selectList(wrapper);
    }

}
