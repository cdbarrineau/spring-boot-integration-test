package cdb.spring.integration.services;

import cdb.spring.integration.factory.IDeviceController;
import cdb.spring.integration.factory.ProductionFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class MockProductionFactory extends ProductionFactory {

    @Override
    public IDeviceController getDeviceController() {

        log.info("MockProductionFactory::getDeviceController()");

        return new MockDeviceController();
    }

    @Override
    public String toString() {
        return "MockProductionFactory";
    }
}
