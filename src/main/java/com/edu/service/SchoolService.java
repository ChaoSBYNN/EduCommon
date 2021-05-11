package com.edu.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.edu.dao.entity.SchoolAreaEntity;
import com.edu.dao.entity.SchoolClassEntity;
import com.edu.dao.entity.SchoolEntity;
import com.edu.dao.mapper.SchoolAreaMapper;
import com.edu.dao.mapper.SchoolMapper;
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
public class SchoolService {
    @Resource(name = "schoolMapper")
    private SchoolMapper schoolMapper;

    @Resource(name = "schoolAreaMapper")
    private SchoolAreaMapper schoolAreaMapper;


    public SchoolEntity getSchool(SchoolEntity userCondition){
        Wrapper<SchoolEntity> wrapper = new QueryWrapper<>(userCondition);
        return schoolMapper.selectOne(wrapper);
    }

    public List<SchoolAreaEntity> getAreas(SchoolAreaEntity condition) {
        Wrapper<SchoolAreaEntity> wrapper = new QueryWrapper<>(condition);
        return schoolAreaMapper.selectList(wrapper);
    }

    public SchoolAreaEntity getArea(SchoolAreaEntity condition) {
        Wrapper<SchoolAreaEntity> wrapper = new QueryWrapper<>(condition);
        return schoolAreaMapper.selectOne(wrapper);
    }

    public int createArea(SchoolAreaEntity create) {
        return schoolAreaMapper.insert(create);
    }

    public int updateArea(SchoolAreaEntity update) {
        return schoolAreaMapper.updateById(update);
    }


}
