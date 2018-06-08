package com.yangqu.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangst on 2018/6/7.
 */

@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

    @Autowired
    private Environment env;  //

    @Bean(name = "zoneDataSource")
    @Qualifier("zoneDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.zonedata")  // (4)
    public DataSource ZoneDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "zoneLogSource")
    @Qualifier("zoneLogSource")
    @ConfigurationProperties(prefix = "spring.datasource.zonelog")  // (4)
    public DataSource ZoneLogSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "worldDataSource")
    @Qualifier("worldDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.worlddata")  // (4)
    public DataSource worldDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public DynamicDatabaseTypeSource dataSource(@Qualifier("zoneDataSource") DataSource zoneData,
                                                @Qualifier("zoneLogSource") DataSource zoneLog,
                                                @Qualifier("worldDataSource") DataSource worldData) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(env.getProperty("spring.datasource.zonedata.name"), zoneData);
        targetDataSources.put(env.getProperty("spring.datasource.zonelog.name"), zoneLog);
        targetDataSources.put(env.getProperty("spring.datasource.worlddata.name"), worldData);

        DynamicDatabaseTypeSource dataSource = new DynamicDatabaseTypeSource();
        dataSource.setTargetDataSources(targetDataSources);
        dataSource.setDefaultTargetDataSource(zoneData);// 默认的datasource设置为zoneData
//        dataSource.setMethodType(DatabaseType.slave, read);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(@Qualifier("zoneDataSource") DataSource zoneData,
                                               @Qualifier("zoneLogSource") DataSource logData,
                                               @Qualifier("worldDataSource") DataSource worldData) throws Exception {

        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(this.dataSource(zoneData,logData,worldData));
        //fb.setTypeAliasesPackage(env.getProperty("mybatis.type-aliases-package"));
        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapper-locations")));
        return fb.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DynamicDatabaseTypeSource dataSource) throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }
}
