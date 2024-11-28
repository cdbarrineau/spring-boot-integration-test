package cdb.spring.integration.services;

import cdb.spring.integration.factory.IDeviceController;
import cdb.spring.integration.factory.ProductionFactory;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DeviceControllerService {

    private final ProductionFactory productionFactory;

    public DeviceControllerService(final ProductionFactory productionFactory) {

        log.info("********************************");
        log.info("Creating DeviceControllerService");
        log.info("DeviceControllerService::ProductionFactory: {}", productionFactory);

        this.productionFactory = productionFactory;
    }

    @PostConstruct
    public void initialize() {
        IDeviceController deviceController = productionFactory.getDeviceController();

        log.info("*********************************");
        log.info("DeviceControllerService::initialize deviceController: {}", deviceController);

        deviceController.initialize();
    }

    @PreDestroy
    public void shutdown() {
        log.info("***********************************");
        log.info("DeviceControllerService::shutdown()");
    }
}
