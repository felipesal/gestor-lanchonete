package com.felipesalles.gestorlanchonete.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("API para gerenciamento de Lanchonetes")
								   .description("API para gerenciamento de lanchonetes, com fluxo completo desde o início do pedido até o encerramento")
				                   .version("1.0.0")
				                   .contact(new Contact("Felipe Salles", 
				                		                "https://github.com/felipesal", 
				                		                "dev.fsalles@gmail.com")
				                		   ).build();
		
		}

}
