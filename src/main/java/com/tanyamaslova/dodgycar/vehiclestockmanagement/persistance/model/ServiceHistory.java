package com.tanyamaslova.dodgycar.vehiclestockmanagement.persistance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="service_history")
public class ServiceHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Version
    private Integer version;
    @ManyToOne
    @JoinColumn(name="car_id")
    private Car car;
    @Column(name="service_date")
    private LocalDate serviceDate;
    @Column(name="next_service_date_due")
    private LocalDate nextServiceDateDue;
    @Column(name = "service_type")
    private String serviceType;


}
