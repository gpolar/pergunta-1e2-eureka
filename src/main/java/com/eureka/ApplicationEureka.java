package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Esta classe inicia o Server Eureka para o registro de serviços
 * 
 * @author: Gustavo Polar gpolars@gmail.com, contato@gustavopolarsa.com
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationEureka.class, args);
	}
}