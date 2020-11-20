package com.gloryh.mybatisplus.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 *
 * @author 黄光辉
 * @since 2020/10/6
 **/
@Configuration
public class MyBatisPlusConfig {

    /**
     * 乐观锁
     * @return 乐观锁对象
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        //返回一个乐观锁对象
        return new OptimisticLockerInterceptor();
    }

    /**
     * 分页配置
     * @return 分页配置对象
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
