package com.devzb.framework.lang.mybatis;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis扫描接口
 * 
 * @author zhangbin
 *
 */
@Configuration
@AutoConfigureAfter(MyBatisConfig.class) // 注意:由于MapperScannerConfigurer执行的比较早，所以必须有此注解
public class MyBatisMapperScannerConfig {

	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setSqlSessionFactoryBeanName(MyBatisConfig.FACTORY_NAME);
		mapperScannerConfigurer.setBasePackage("com.devzb.*.dao.mapper");
		return mapperScannerConfigurer;
	}
}