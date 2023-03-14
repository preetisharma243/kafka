package com.psit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class Ms2KafkaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms2KafkaProviderApplication.class, args);
	}

}
