package com.edu.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.ObjectUtils;

/**
 * @ClassName BaseController
 * @Descripion TODO
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/4/18 下午4:38
 * @Version 1.0
 **/
public class BaseController{

    public String createJsonResult(Object object) {
        return JSONObject.toJSONString(object);
    }

}
