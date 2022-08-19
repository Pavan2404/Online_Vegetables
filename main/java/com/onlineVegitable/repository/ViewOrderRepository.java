package com.onlineVegitable.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlineVegitable.modal.Vegetable;
import com.onlineVegitable.modal.ViewOrder;
@Repository
public interface ViewOrderRepository extends CrudRepository<ViewOrder, Integer> {
	 Iterable<ViewOrder> findAll() ;
	//void deleteById(Optional<ViewOrder> vo);

}
