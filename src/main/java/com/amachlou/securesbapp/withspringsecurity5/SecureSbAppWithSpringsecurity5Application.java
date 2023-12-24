package com.amachlou.securesbapp.withspringsecurity5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(RsaKeyProperties.class)
public class SecureSbAppWithSpringsecurity5Application {

	public static void main(String[] args) {
		SpringApplication.run(SecureSbAppWithSpringsecurity5Application.class, args);
	}

}
