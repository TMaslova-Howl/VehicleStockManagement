package com.tanyamaslova.dodgycar.vehiclestockmanagement.service;

import com.tanyamaslova.dodgycar.vehiclestockmanagement.TestConfig;
import com.tanyamaslova.dodgycar.vehiclestockmanagement.entities.Car;
import com.tanyamaslova.dodgycar.vehiclestockmanagement.entities.MotDetails;
import com.tanyamaslova.dodgycar.vehiclestockmanagement.repositories.CarRepository;
import org.hibernate.LazyInitializationException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = TestConfig.class)
@ActiveProfiles("test")
class VehicleManagementServiceTest {
   @Autowired
    private CarRepository carRepository;
    @Autowired
    private VehicleManagementService vehicleManagementService;

    @Test
    void shouldThrowLazyInitializationException() {
        //Given
        Car car = new Car();
        carRepository.saveAndFlush(car);
        MotDetails motDetails = new MotDetails();
        motDetails.setTestDate(LocalDate.now());
        //Then
        assertThrows(LazyInitializationException.class,
                () -> vehicleManagementService.updateCarMotDetails(car.getId(), motDetails));
    }

}