package com.TimedSend.Gcode;



import com.alibaba.druid.sql.dialect.mysql.ast.MySqlKey;
import com.baomidou.mybatisplus.extension.incrementer.OracleKeyGenerator;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//设置mapper接口的扫描包
//@MapperScan("com.xquant.engine.algo.dao.*")
public class MybatisConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
     * 序列生成器
     */
    @Bean
    public OracleKeyGenerator oracleKeyGenerator() {
        return new OracleKeyGenerator();
    }

}