package io.github.cursospring.cloudgatewayms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudGatewayMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayMsApplication.class, args);
	}

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder){
		return builder
				.routes()
					.route(r -> r.path("/clientes/**").uri("lb://clientes-ms"))
					.route(r -> r.path("/cartoes/**").uri("lb://cartoes-ms"))
					.route(r -> r.path("/avaliacoes-credito/**").uri("lb://avaliador-credito-ms"))
				.build();
	}

}
