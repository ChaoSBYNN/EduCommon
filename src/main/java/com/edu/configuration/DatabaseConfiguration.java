package com.edu.configuration;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @ClassName DatabaseConfig
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2020/7/30 3:19 下午
 * @Version 1.0
 **/
@Setter
@Getter
@Component
@Import(ProResourceConfig.class)
public class DatabaseConfiguration {

    @Value("${jdbc.host:0.0.0.0}")
    private String host;

    @Value("${jdbc.driver:com.mysql.cj.jdbc.Driver}")
    private String driver;

    @Value("${jdbc.username:root}")
    private String username;

    @Value("${jdbc.password:123456}")
    private String password;

    @Value("${jdbc.port:3306}")
    private String port;

    // 配置初始化大小、最小、最大
    @Value("${jdbc.initialSize:1}")
    private int initialSize;
    @Value("${jdbc.minIdle:10}")
    private int minIdle;
    @Value("${jdbc.maxActive:200}")
    private int maxActive;

    // 配置获取连接等待超时的时间
    @Value("${jdbc.maxWait:6000}")
    private int maxWait;

    // 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
    @Value("${jdbc.timeBetweenEvictionRunsMillis:60000}")
    private long timeBetweenEvictionRunsMillis;

    // 配置一个连接在池中最小生存的时间，单位是毫秒
    @Value("${jdbc.minEvictableIdleTimeMillis:300000}")
    private long minEvictableIdleTimeMillis;

    @Value("${jdbc.testWhileIdle:true}")
    private boolean testWhileIdle;

    @Value("${jdbc.testOnBorrow:false}")
    private boolean testOnBorrow;

    @Value("${jdbc.testOnReturn:false}")
    private boolean testOnReturn;

    @Value("${jdbc.validationQuery:SELECT 'x'}")
    private String validationQuery;

    // 打开PSCache，并且指定每个连接上PSCache的大小
    @Value("${jdbc.poolPreparedStatements:true}")
    private boolean poolPreparedStatements;

    @Value("${jdbc.maxPoolPreparedStatementPerConnectionSize:20}")
    private int maxPoolPreparedStatementPerConnectionSize;

    // 配置监控统计拦截的filters，去掉后监控界面sql无法统计
    @Value("${jdbc.filters:stat}")
    private String filters;
}
