package com.learning.config;

import com.learning.importtest.TestImportSelector;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.*;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages =
        {"com/learning/dao",
        "com/learning/service",
        "com/learning/beanpostprocessor",
        "com/learning/importtest",
        "com/learning/methodintercepter",
        "com/learning/aop",
        "com/learning/controller"})
@Import(TestImportSelector.class)
@EnableAspectJAutoProxy
//@MapperScan(value = {"com.learning.dao","com.learning.methodintercepter"})
public class AppConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource)
    {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    public DataSource dataSource()
    {
        PooledDataSource source = new PooledDataSource();
        source.setDriver("com.mysql.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/mysqltutorial?useSSL=false");
        source.setUsername("root");
        source.setPassword("citrix");
        return source;
    }
    
}
