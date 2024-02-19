package com.benediht.servicedoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDoctorApplication.class, args);
	}

}