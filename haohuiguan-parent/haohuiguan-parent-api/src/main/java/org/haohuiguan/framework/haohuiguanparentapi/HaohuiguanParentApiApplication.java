package org.haohuiguan.framework.haohuiguanparentapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,MongoAutoConfiguration.class})
public class HaohuiguanParentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaohuiguanParentApiApplication.class, args);
	}

}
