package com.tanyamaslova.dodgycar.vehiclestockmanagement.repositories;

import com.tanyamaslova.dodgycar.vehiclestockmanagement.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
