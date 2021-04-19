package com.edu.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName SchoolClass
 * @Descripion TODO
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/4/19 上午11:45
 * @Version 1.0
 * create table school_class
 * (
 * 	id int auto_increment
 * 		primary key,
 * 	sid varchar(32) null,
 * 	cid varchar(32) null,
 * 	times int null,
 * 	type int null,
 * 	`desc` text null,
 * 	tid varchar(32) null
 * );
 **/
@Getter
@Setter
@TableName(value = "school_class")//指定表名
public class SchoolClassEntity {

    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Integer id;
    private String sid;
    private String cid;
    private Integer times; // 课时 TODO N期
    private Integer type;
    private String desc;
    private String tid;
}
