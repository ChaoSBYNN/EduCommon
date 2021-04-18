package com.edu.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class DBDataSourceConfiguration {

    @Resource
    private DatabaseConfiguration databaseConfig;

    @Value("${jdbc.database}")
    private String database;

    @SuppressWarnings("DuplicatedCode")
    @Bean(name = "dbDataSource")
    public DataSource dbDataSource() {
        String url = "jdbc:mysql://"+ databaseConfig.getHost() + ":" + databaseConfig.getPort() +"/" + database + "?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(databaseConfig.getDriver());
        dataSource.setUrl(url);
        dataSource.setUsername(databaseConfig.getUsername());
        dataSource.setPassword(databaseConfig.getPassword());
        return dataSource;
    }

    @Bean(name = "dbTransactionManager")
    public DataSourceTransactionManager dbTransactionManager() {
        return new DataSourceTransactionManager(dbDataSource());
    }

//    @Bean(name = "dbSqlSessionFactory")
//    public SqlSessionFactory dbSqlSessionFactory(@Qualifier("dbDataSource") DataSource clusterDataSource)
//            throws Exception {
//        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(clusterDataSource);
//        sessionFactory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
//        return sessionFactory.getObject();
//    }

}