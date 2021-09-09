package com.hongkongcoder.salon.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="slot")
@Data
public class Slot {
    
	
	enum SlotStatus{
		AVAILABLE,
		OPEN,
		CONFIRMED,
		CANCELLED
	}
	
	public Slot() {
		
	}
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDateTime confirmedAt;
    private LocalDateTime lockedAt;
    private LocalDateTime slotFor;
    private SlotStatus status;
    
    @Column(length=255)
    private String stylistName;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<SalonServiceDetail> availableService;
    
    @ManyToOne
    private SalonServiceDetail selectedService;
    
    
}
