package com.king;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KingApplicationSon {

	public static void main(String[] args) {
		new SpringApplicationBuilder(KingApplicationSon.class)
			.profiles("son").run(args);
	}

}
