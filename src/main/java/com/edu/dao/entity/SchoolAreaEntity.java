package com.edu.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName SchoolAreaEntity
 * @Descripion TODO
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/4/19 上午11:41
 * @Version 1.0
 * create table school_area
 * (
 * 	id int auto_increment
 * 		primary key,
 * 	aid varchar(32) null,
 * 	sid varchar(32) null,
 * 	name varchar(32) null,
 * 	address varchar(255) null,
 * 	code varchar(10) null
 * );
 **/
@Getter
@Setter
@TableName(value = "school_area")
public class SchoolAreaEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String aid;
    private String sid;
    private String name;
    private String address;
    private String code;
}
