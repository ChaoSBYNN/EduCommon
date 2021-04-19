package com.edu.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName SchoolTeacher
 * @Descripion TODO
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/4/19 上午11:49
 * @Version 1.0
 * create table school_teacher
 * (
 * 	id int auto_increment
 * 		primary key,
 * 	sid varchar(32) null,
 * 	name varchar(10) null,
 * 	phone int null,
 * 	age int null,
 * 	head_url varchar(255) null,
 * 	address varchar(255) null,
 * 	type int null,
 * 	`desc` text null,
 * 	duty varchar(32) null,
 * 	position varchar(32) null
 * );
 **/
@Getter
@Setter
@TableName(value = "school_teacher")//指定表名
public class SchoolTeacherEntity {
    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Integer id;
    private String tid;
    private String sid;
    private String name;
    private Integer phone;
    private Integer age;
    @TableField(value = "head_url")
    private String headUrl;
    private String address;
    private Integer type;
    private String desc;
    private String duty;
    private String position;
}
