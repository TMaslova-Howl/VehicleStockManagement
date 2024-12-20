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

    @Column(name = "fueql_type")
    private String fuelType;

    @Column(name = "car_category")
    @Enumerated(EnumType.STRING)
    private CarCategory carCategory;

    @OneToOne(mappedBy = "car")
    private CarHireDetails carHireDetails;

    @OneToOne(mappedBy = "car")
    private List<ServinceHistory> serviceHistory;

    @OneToMany(mappedBy = "car")
    private List<MotDetails> motDetails;

    @OneToOne(mappedBy = "car")
    private InsuranceDetails insuranceDetails;

    @Version
    private Integer version;

}
