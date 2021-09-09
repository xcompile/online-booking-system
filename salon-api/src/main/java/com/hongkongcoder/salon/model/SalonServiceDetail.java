package com.hongkongcoder.salon.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;


@Entity
@Table(name="salon_service_detail")
@Data
@ToString
public class SalonServiceDetail {

	public SalonServiceDetail() {
		
	}
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255)
    private String name;
    @Column(length = 255)
    private String description;
    private BigDecimal price;
    @Column(name="time_in_minutes")
    private Integer timeInMinutes;


}