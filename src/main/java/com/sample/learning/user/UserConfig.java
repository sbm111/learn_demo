package com.sample.learning.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	
	@Bean
    public User superUser() {
        return new User("Dan","Vega");
    }

}
