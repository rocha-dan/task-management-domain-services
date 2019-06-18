package br.com.rocha.dan.api.task.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SimulationConfig {

	private static final String SHOWCASE = "SHOWCASE";

	@Value("#{'${simulation.features.list}'.split(',')}")
	private List<String> simulationFeaturesList;



//	@Bean
//	@Primary
//	public ShowcaseRepository showcaseRepository() {
//		if (simulationFeaturesList.contains(SHOWCASE))
//			return new ShowcaseRepositorySimulation();
//		return new ShowcaseRepositoryImpl();
//	}

}
