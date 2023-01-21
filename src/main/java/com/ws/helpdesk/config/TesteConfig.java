package com.ws.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ws.helpdesk.services.DBService;

@Configuration
@Profile("test")
public class TesteConfig {
	@Autowired
	private DBService dBService;
	
	@Bean
	public void instanciaDB() {
		this.dBService.instanciaDB();
	}
}
