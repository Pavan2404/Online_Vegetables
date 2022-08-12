package com.onlineVegitable.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlineVegitable.modal.Addtocart;
@Repository
public interface AddtocartRepository extends CrudRepository<Addtocart, Integer> {

}
