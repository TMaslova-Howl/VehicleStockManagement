package com.tanyamaslova.dodgycar.vehiclestockmanagement.persistance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String make;
    private String model;
    private String registrationNumber;
    private Status status;
    private String fuelType;

    @Enumerated(EnumType.STRING)
    private CarCategory carCategory;

    @OneToMany(mappedBy = "car")
    private List<CarHireDetails> carHireDetails;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ServiceHistory> serviceHistory;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MotDetails> motDetails;

    @OneToOne(mappedBy = "car")
    private InsuranceDetails insuranceDetails;

    @Version
    private Integer version;

}
