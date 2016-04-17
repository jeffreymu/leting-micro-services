package com.leting.microservice.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * Leting spring boot admin server
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class LetingBootAdminServer {
	public static void main(String[] args) {
		SpringApplication.run(LetingBootAdminServer.class, args);
	}
}
