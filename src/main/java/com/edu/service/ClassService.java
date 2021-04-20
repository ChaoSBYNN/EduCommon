package com.edu.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.edu.dao.entity.SchoolClassEntity;
import com.edu.dao.entity.UserEntity;
import com.edu.dao.mapper.SchoolClassMapper;
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
public class ClassService {

    @Resource(name = "schoolClassMapper")
    private SchoolClassMapper schoolClassMapper;


    public SchoolClassEntity getClass(SchoolClassEntity userCondition){
        Wrapper<SchoolClassEntity> wrapper = new QueryWrapper<>(userCondition);
        return schoolClassMapper.selectOne(wrapper);
    }

    public List<SchoolClassEntity> getClassList(SchoolClassEntity userCondition){
        Wrapper<SchoolClassEntity> wrapper = new QueryWrapper<>(userCondition);
        return schoolClassMapper.selectList(wrapper);
    }
}
