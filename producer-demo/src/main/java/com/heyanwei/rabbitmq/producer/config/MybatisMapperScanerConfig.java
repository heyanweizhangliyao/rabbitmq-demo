package com.heyanwei.rabbitmq.producer.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: heyanwi
 * @CreateDate: 2019/5/31 9:11
 *
 *
 * @Configuration 替代XML配置 相当于<Beans></Beans>
 * @AutoConfigureAfter(MybatisDataSourceConfig.class)  先加载MybatisDataSourceConfig，再加载该类
 */
@Configuration
@AutoConfigureAfter(MybatisDataSourceConfig.class)
public class MybatisMapperScanerConfig {


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
         MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
         mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
         mapperScannerConfigurer.setBasePackage("com.heyanwei.rabbitmq.producer.mapper");
         return mapperScannerConfigurer;
    }

}