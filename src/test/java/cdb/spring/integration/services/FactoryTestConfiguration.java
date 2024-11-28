package cdb.spring.integration.services;

import cdb.spring.integration.factory.ProductionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class FactoryTestConfiguration {

    @Bean
    @Primary
    public ProductionFactory productionFactory() {
        return new MockProductionFactory();
    }
}
