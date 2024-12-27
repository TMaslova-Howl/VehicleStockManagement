package com.tanyamaslova.dodgycar.vehiclestockmanagement.service;

import com.tanyamaslova.dodgycar.vehiclestockmanagement.entities.Car;
import com.tanyamaslova.dodgycar.vehiclestockmanagement.entities.MotDetails;
import com.tanyamaslova.dodgycar.vehiclestockmanagement.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleManagementService {

    private final CarRepository carRepository;

    public void updateCarMotDetails(Integer carId, MotDetails motDetails) {
        Car car = carRepository.findById(carId).orElseThrow(()-> new RuntimeException("No car found"));
        car.getMotDetails().add(motDetails);
        carRepository.save(car);
    }
}
