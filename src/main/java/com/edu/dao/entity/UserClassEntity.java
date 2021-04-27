package com.edu.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName UserClassEntity
 * @Descripion TODO
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/4/27 上午11:24
 * @Version 1.0
 * create table user_class
 * (
 * 	id int auto_increment
 * 		primary key,
 * 	uid varchar(32) null,
 * 	sid varchar(32) null,
 * 	aid varchar(32) null,
 * 	name varchar(32) null,
 * 	`desc` text null,
 * 	status int null,
 * 	stage int null,
 * 	times int null,
 * 	type int null
 * );
 **/
@Getter
@Setter
@TableName(value = "user_class")//
public class UserClassEntity {
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Integer id;
    private String sid;
    private String aid;
    private String uid;
    private String cid;
    private String name;
    private String desc;
    private Integer status;
    private Integer times;
    private Integer type;
}
