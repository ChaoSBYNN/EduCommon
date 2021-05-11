package com.edu.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName UserScheduleEntity
 * @Descripion TODO create database
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/5/2 下午12:41
 * @Version 1.0
 **/
@Getter
@Setter
@TableName(value = "user_schedule")//指定表名
public class UserScheduleEntity {

    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Integer id;
    private String uid;
    private String sid;
    private String aid;
    private String cid;
    private Long time;
    private Integer status;
    private String desc;
    private String detail;
}
