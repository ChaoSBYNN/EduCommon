package com.edu.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Schooluser
 * @Descripion TODO
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/4/19 上午11:48
 * @Version 1.0
 * create table school_user
 * (
 * 	id int auto_increment
 * 		primary key,
 * 	sid varchar(32) null,
 * 	uid varchar(32) null,
 * 	aid varchar(32) null
 * );
 **/
@Getter
@Setter
@TableName(value = "school_user")//指定表名
public class SchoolUserEntity {
    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Integer id;
    private String sid;
    private String aid;
    private String uid;
}
