package com.hongkongcoder.salon.repository;


import org.springframework.data.repository.CrudRepository;

import com.hongkongcoder.salon.model.Slot;

public interface SlotRepository extends CrudRepository<Slot,Long> {
    
}
