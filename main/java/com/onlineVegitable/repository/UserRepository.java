package com.onlineVegitable.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.onlineVegitable.modal.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
