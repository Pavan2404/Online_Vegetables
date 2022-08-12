package com.onlineVegitable.repository;

import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

import com.onlineVegitable.modal.Vegetable;
@Repository
public interface VegetableRepository extends CrudRepository<Vegetable,Long>{
	Vegetable findByVegetableIdentifier(String vegetableIdentifier);
	
	 Iterable<Vegetable> findAll() ;
}
