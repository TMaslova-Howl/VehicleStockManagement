package com.tanyamaslova.dodgycar.vehiclestockmanagement.persistance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "mot_details")
public class MotDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @Column(name="test_date")
    private LocalDate testDate;
    @Column(name="expiry_date")
    private LocalDate expiryDate;
    @Column(name="test_results")
    private String testResults;
    @Version
    private Integer version;

}
