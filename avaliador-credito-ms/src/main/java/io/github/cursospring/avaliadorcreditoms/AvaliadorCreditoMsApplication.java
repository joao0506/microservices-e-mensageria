package io.github.cursospring.avaliadorcreditoms;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableRabbit
public class AvaliadorCreditoMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvaliadorCreditoMsApplication.class, args);
	}

}
