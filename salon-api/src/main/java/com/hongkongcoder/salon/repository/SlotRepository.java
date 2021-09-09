package com.hongkongcoder.salon.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hongkongcoder.salon.model.Slot;


@Repository
public interface SlotRepository extends CrudRepository<Slot,Long> {
    
}
