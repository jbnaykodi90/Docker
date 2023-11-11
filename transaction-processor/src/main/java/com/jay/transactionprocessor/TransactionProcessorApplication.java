package com.jay.transactionprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpStatus;

@SpringBootApplication
@EnableEurekaClient
public class TransactionProcessorApplication {

	public static void main(String[] args) {
		HttpStatus.ACCEPTED

		SpringApplication.run(TransactionProcessorApplication.class, args);
	}

}
