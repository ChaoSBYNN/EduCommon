package com.edu.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * create table user
 * (
 id bigint auto_increment
 primary key,
 uid varchar(32) null,
 username varchar(32) null,
 password varchar(18) null,
 name varchar(32) null,
 phone int null,
 head_url varchar(255) null,
 source int null,
 platform int null,
 type int null,
 status int null,
 birthday varchar(18) null,
 address varchar(255) null,
 sid varchar(32) null,
 age int null,
 sex int null,
 art_name varchar(32) null,
 level int null
 * );
 */
@Getter
@Setter
@TableName(value = "user")//指定表名
public class UserEntity {

    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Integer id;
    private String uid;
    private String username;
    private String password;
    private String name;
    private Integer phone;
    //若没有开启驼峰命名，或者表中列名不符合驼峰规则，可通过该注解指定数据库表中的列名，exist标明数据表中有没有对应列
    @TableField(value = "head_url")
    private String headUrl;
    private Integer source;
    private Integer platform;
    private Integer type;
    private Integer status;
    private String birthday;
    private String address;
    private String sid;
    @TableField(value = "art_name")
    private String artName;
    private Integer sex;
    private Integer level;

}