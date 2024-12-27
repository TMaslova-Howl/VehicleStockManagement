package com.tanyamaslova.dodgycar.vehiclestockmanagement;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.tanyamaslova.dodgycar.vehiclestockmanagement")
@EnableJpaRepositories(basePackages = "com.tanyamaslova.dodgycar.vehiclestockmanagement.repositories")
@EntityScan(basePackages = "com.tanyamaslova.dodgycar.vehiclestockmanagement.entities")
public class TestConfig {
}
