package com.ecommerce.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class ReviewMsApplication {


	public static void main(String[] args) {
		SpringApplication.run(ReviewMsApplication.class, args);
	}

}
