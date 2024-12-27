package com.tanyamaslova.dodgycar.vehiclestockmanagement.persistance.repository;

import com.tanyamaslova.dodgycar.vehiclestockmanagement.persistance.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
