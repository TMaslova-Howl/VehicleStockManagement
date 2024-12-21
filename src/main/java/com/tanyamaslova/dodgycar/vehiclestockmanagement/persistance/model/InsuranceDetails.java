package com.tanyamaslova.dodgycar.vehiclestockmanagement.persistance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="insurance_details")
public class InsuranceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="insurance_name")
    private String insuranceName;
    @Column(name="insurance_type")
    private String insuranceType;
    @Column(name="insurance_start_date")
    private LocalDate insuranceStartDate;
    @Column(name="insurance_end_date")
    private LocalDate insuranceEndDate;
    @Version
    private Integer version;
}
