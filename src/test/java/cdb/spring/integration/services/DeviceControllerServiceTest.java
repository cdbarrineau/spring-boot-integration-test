package cdb.spring.integration.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@Profile("test")
@SpringBootTest
@ExtendWith(MockitoExtension.class)
@Service
@Slf4j
class DeviceControllerServiceTest {

    @Autowired
    private DeviceControllerService deviceControllerService;

    @BeforeEach
    public void beforeEach() {
        log.info("DeviceControllerServiceTest::beforeEach: deviceControllerService: {}", deviceControllerService);
    }

    @Test
    void initialize() {
        deviceControllerService.initialize();
    }
}