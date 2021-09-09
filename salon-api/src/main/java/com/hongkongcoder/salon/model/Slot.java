package com.hongkongcoder.salon.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name="slot")
@Data
public class Slot {
    
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="confirmed_at",nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date confirmedAt;
    
    @Column(name="locked_at",nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lockedAt;
    
    @Column(name="slot_for",nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date slotFor;
    
    @Column(name="status",nullable = true)
    private Integer status;
    
    @Column(name="stylist_name",length=255,nullable = true)
    private String stylistName;
    
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = SalonServiceDetail.class)
    @JoinColumn(name = "selected_service_id")
    private SalonServiceDetail selectedService;
    
    
    
}
