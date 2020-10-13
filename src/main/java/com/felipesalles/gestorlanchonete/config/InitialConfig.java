package com.felipesalles.gestorlanchonete.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.felipesalles.gestorlanchonete.services.DBService;

@Configuration
public class InitialConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public void instanciaBaseDeDados() throws Exception {
		dbService.instantiateDatabase();
	}
	
}
