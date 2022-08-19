package com.onlineVegitable.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onlineVegitable.modal.Vegetable;

@Repository
public interface VegitableRepository extends JpaRepository<Vegetable, Integer> {
	
	
	public List<Vegetable> findByProductName(String vegName);

	@Query("SELECT prod FROM Vegetable veg  WHERE veg.price>=:pri ") // JPQL
	public List<Vegetable> getByPrice(@Param("pri") double price);
}

