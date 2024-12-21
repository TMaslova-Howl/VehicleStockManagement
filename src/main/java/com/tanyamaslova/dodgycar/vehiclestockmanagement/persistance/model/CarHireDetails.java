package com.tanyamaslova.dodgycar.vehiclestockmanagement.persistance.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "car_hire_details")
@Entity
public class CarHireDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Version
    private Integer version;

}
