package com.c4.write.registry;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication {

	private static Logger logger = Logger.getLogger(RegistryApplication.class);
	public static void main(String[] args) {
		logger.info("------eureka注册中心开始启动------");
		SpringApplication.run(RegistryApplication.class, args);
		logger.info("------eureka注册中心启动成功------");
	}
}
