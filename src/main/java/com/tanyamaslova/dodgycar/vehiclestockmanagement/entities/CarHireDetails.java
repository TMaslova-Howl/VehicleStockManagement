package com.tanyamaslova.dodgycar.vehiclestockmanagement.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "car_hire_details")
@Entity
public class CarHireDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Car car;
    @Version
    private Integer version;

}
