package com.king;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KingApplicationFather {

	public static void main(String[] args) {
		new SpringApplicationBuilder(KingApplicationFather.class)
			.profiles("father").run(args);
	}

}
