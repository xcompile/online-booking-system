package com.hongkongcoder.salon.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class SalonServiceDetail {

	
    @Id
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer timeInMinutes;


}