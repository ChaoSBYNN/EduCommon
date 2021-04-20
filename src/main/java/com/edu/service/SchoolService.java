package com.edu.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.edu.dao.entity.SchoolClassEntity;
import com.edu.dao.entity.SchoolEntity;
import com.edu.dao.mapper.SchoolMapper;
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
public class SchoolService {

    @Resource(name = "schoolMapper")
    private SchoolMapper schoolMapper;

    public SchoolEntity getSchool(SchoolEntity userCondition){
        Wrapper<SchoolEntity> wrapper = new QueryWrapper<>(userCondition);
        return schoolMapper.selectOne(wrapper);
    }
}
