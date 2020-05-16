package com.sample.learning.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/com/sample/learning/properties/abc.properties")
public class DBConfig {
	@Value("${bean.name}") String beanName;

	@Value("${bean.surname}") String surname;
	
	@Bean("oracle")
	public OracleProperty getOracleProperty() {
		return new OracleProperty(this.beanName);
	}
	
	@Bean("db2")
	public OracleProperty getDB2Property() {
		return new OracleProperty(this.surname);
	}
}
