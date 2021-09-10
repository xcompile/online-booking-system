package com.hongkongcoder.salon.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.hongkongcoder.salon.model.Slot;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Repository
public interface SlotRepository extends ReactiveCrudRepository<Slot,Long> {

	@Query("SELET * FROM slot WHERE id IN(SELECT slot_id FROM slot_available_services WHERE available_services_id=:serviceDetailId)")
	Flux<Slot> findAvailableSlotsForService(
			Long serviceDetailId
			);
	Mono<Slot> findById(Long id);
	Mono<Slot> findByIdAndStatus(Long id, Integer slotStatus);
	
	
}
