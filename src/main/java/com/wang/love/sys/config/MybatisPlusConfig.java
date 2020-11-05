//package com.wang.love.config;
//
//import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
///**
// *mybatis配置文件
// * EnableTransactionManagement 开启事务
// */
//@Configuration
//@MapperScan("com.wang.love.dao")
//@EnableTransactionManagement
//public class MybatisPlusConfig {
//
//    /** 性能拦截分析器 不建议生产时使用
//     * @return PerformanceInterceptor
//     */
//    @Bean
//    public PerformanceInterceptor performanceInterceptor(){
//        return new PerformanceInterceptor();
//    }
//
//    /**分页拦截器
//     * @return PaginationInterceptor
//     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor(){
//        return new PaginationInterceptor();
//    }
//
//}
