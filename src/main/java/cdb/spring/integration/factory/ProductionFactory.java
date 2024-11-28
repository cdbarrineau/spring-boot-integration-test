package cdb.spring.integration.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProductionFactory {

    public IDeviceController getDeviceController() {

        log.info("##################");
        log.info("ProductionFactory::getDeviceController()");
        log.info("##################");

        throw new RuntimeException("Not supposed to be here.");

//        return new DeviceController();
    }

    @Override
    public String toString() {
        return "ProductionFactory";
    }
}
