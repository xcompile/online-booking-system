package com.hongkongcoder.salon.model;

import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Slot {
    
	
	public enum SlotStatus{
		AVAILABLE,
		OPEN,
		CONFIRMED,
		CANCELLED
	}
	
    @Id
    private Long id;
    
    private LocalDateTime confirmedAt;
    private LocalDateTime lockedAt;
    private LocalDateTime slotFor;
    private int status;
    
    private String stylistName;
    
    @JsonIgnore
    @Transient
    private Set<SalonServiceDetail> availableService;

    @Column("selected_service_id")
    private Long selectedServiceId;

	public SlotStatus getStatus() {
		return SlotStatus.values()[status];
	}

	public void setStatus(SlotStatus status) {
		this.status = status.ordinal();
	}
    
    
    
}
