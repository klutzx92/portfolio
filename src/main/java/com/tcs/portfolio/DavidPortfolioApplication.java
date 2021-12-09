package com.tcs.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DavidPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DavidPortfolioApplication.class, args);
	}

}
