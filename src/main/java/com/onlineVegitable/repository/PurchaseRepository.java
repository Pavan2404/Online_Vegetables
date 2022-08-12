package com.onlineVegitable.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlineVegitable.modal.Purchase;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
	
}
