package io.github.cursospring.clientesms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientesMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientesMsApplication.class, args);
	}

}
