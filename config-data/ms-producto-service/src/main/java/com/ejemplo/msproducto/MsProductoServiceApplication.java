package com.ejemplo.msproducto;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Producto", version = "1.0",
		description = "Microservicio de producto"))
public class MsProductoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProductoServiceApplication.class, args);
	}
}
