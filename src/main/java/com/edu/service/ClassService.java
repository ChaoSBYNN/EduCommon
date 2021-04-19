package com.edu.service;

import com.edu.dao.mapper.SchoolClassMapper;
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
public class ClassService {

    @Resource(name = "schoolClassMapper")
    private SchoolClassMapper schoolClassMapper;
}
