package com.heyanwei.rabbitmq.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.heyanwei.rabbitmq.producer"})
public class SpringProducerApplication {

	public static void main(String[] args) {
        SpringApplication.run(SpringProducerApplication.class, args);
	}

}