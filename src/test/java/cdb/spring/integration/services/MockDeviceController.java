package cdb.spring.integration.services;

import cdb.spring.integration.factory.IDeviceController;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class MockDeviceController implements IDeviceController {

    @Override
    public void initialize() {
        log.info("MockDeviceController::initialize()");
    }

    @Override
    public String toString() {
        return "Mock DeviceController";
    }
}
