package com.hongkongcoder.salon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hongkongcoder.salon.model.SalonServiceDetail;

@Repository
public interface SalonServiceDetailRepository extends CrudRepository<SalonServiceDetail,Long> {
    
}
