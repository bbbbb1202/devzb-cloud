
package com.devzb.framework.lang.mybatis;

import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.devzb.framework.lang.properties.DataSourceProperties;

@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
public class MybatisDataSource {
	private Log						log	= LogFactory.getLog(MybatisDataSource.class);
	private DruidDataSource			pool;

	@Autowired
	private DataSourceProperties	dataSourceProperties;

	@Bean(name = "dataSource", destroyMethod = "close")
	public DataSource dataSource() {
		if (pool != null) {
			return pool;
		}

		if (dataSourceProperties == null) {
			throw new RuntimeException("DataSourceProperties must not be null");
		}

		log.info("dataSourceProperties url === " + dataSourceProperties.getUrl());
		log.info("dataSourceProperties username === "
												+ dataSourceProperties.getUsername());
		log.info("dataSourceProperties password === "
												+ dataSourceProperties.getPassword());

		DataSourceProperties config = dataSourceProperties;
		pool = new DruidDataSource();
		pool.setDriverClassName(config.getDriverClassName());
		pool.setUrl(config.getUrl());
		if (config.getUsername() != null) {
			pool.setUsername(config.getUsername());
		}
		if (config.getPassword() != null) {
			pool.setPassword(config.getPassword());
		}
		pool.setInitialSize(config.getInitialSize());
		pool.setMaxActive(config.getMaxActive());
		pool.setMinIdle(config.getMinIdle());
		pool.setTestOnBorrow(config.isTestOnBorrow());
		pool.setTestOnReturn(config.isTestOnReturn());
		pool.setValidationQuery(config.getValidationQuery());
		return pool;
	}

	@PreDestroy
	public void close() {
		if (pool != null) {
			pool.close();
		}
	}
}
