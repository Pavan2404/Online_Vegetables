package com.onlineVegitable.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.onlineVegitable.exception.AccountNotFoundException;
import com.onlineVegitable.modal.User;



@Repository
public class QueryClassPersitContext {
	@PersistenceContext
	EntityManager eManager;
	public User findByUserName(String username) throws AccountNotFoundException {
		TypedQuery<User> qry = eManager.createQuery("select u from User u where u.username like :name",User.class);
		qry.setParameter("name", username);
		List<User> user = qry.getResultList();
		if(user.size()==0)throw new AccountNotFoundException("User Not Available !!"+username);
		return user.get(0);
	}
}
