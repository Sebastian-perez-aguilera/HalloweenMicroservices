package com.example.PlacesHalloween;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PlacesHalloweenApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacesHalloweenApplication.class, args);
	}

}
