package cdb.spring.integration.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeviceController implements IDeviceController {

    @Override
    public void initialize() {
        log.info("##################");
        log.info("DeviceController::initialize()");
        log.info("##################");

        throw new RuntimeException("Not supposed to be here.");
    }

    @Override
    public String toString() {
        return "Production DeviceController";
    }
}
