package com.sunny.bugmanage;

import com.sunny.bugmanage.common.config.AppWebMvcConfig;
import com.sunny.bugmanage.common.config.MyBatisConfig;
import com.sunny.bugmanage.common.config.RedisConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableAutoConfiguration //开启自动注入bean
@MapperScan("com.sunny.bugmanage.**.mapper")
@Import({MyBatisConfig.class, /*CorsConfig.class,*/ RedisConfig.class, AppWebMvcConfig.class})
//@EnableRedisHttpSession
public class BugManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugManageApplication.class, args);
	}
}
