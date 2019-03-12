package com.rhiodamuthie.springbootin28m;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootIn28mApplication
//	https://github.com/spring-projects/spring-boot/blob/v2.1.3.RELEASE/spring-boot-samples/spring-boot-sample-web-jsp/src/main/java/sample/jsp/SampleWebJspApplication.java
		extends SpringBootServletInitializer
{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootIn28mApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIn28mApplication.class, args);
	}

}
