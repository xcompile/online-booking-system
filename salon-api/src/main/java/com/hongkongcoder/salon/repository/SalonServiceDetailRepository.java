package com.hongkongcoder.salon.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.hongkongcoder.salon.model.SalonServiceDetail;

import reactor.core.publisher.Mono;

@Repository
public interface SalonServiceDetailRepository extends ReactiveCrudRepository<SalonServiceDetail,Long> {
    public Mono<SalonServiceDetail> findById(Long id);
}
