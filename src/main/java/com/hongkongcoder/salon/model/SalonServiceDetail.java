package com.hongkongcoder.salon.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="salon_service_detail")
@Data
public class SalonServiceDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
 
    @Column(length = 255, nullable = true)
    private String name;

    @Column(length = 255, nullable = true)
    private String description;

    @Column(nullable = true)
    private BigDecimal price;
    
    @Column(name="time_in_minutes",nullable = true)
    private Integer timeInMinutes;


}