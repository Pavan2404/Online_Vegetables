package com.onlineVegitable.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineVegitable.exception.AddtocartIdException;
import com.onlineVegitable.exception.CustomerAccountException;
import com.onlineVegitable.modal.Addtocart;
import com.onlineVegitable.modal.Customersupport;
import com.onlineVegitable.repository.CustomersupportRepository;

@Service
public class CustomersupportServiceImpl implements CustomersupportService{
	@Autowired
	private CustomersupportRepository repos;

	@Override
	public Customersupport saveMsgs(Customersupport cs) {
		// TODO Auto-generated method stub
		return repos.save(cs);
	}

	@Override
	public Optional<Customersupport> getMsgsDetails(Integer Id) throws CustomerAccountException {
		Optional<Customersupport> Atc=repos.findById(Id);
		if(Atc==null) {
			throw new CustomerAccountException("Cart with id :"+Id+"does not exist");
		}
		return repos.findById(Id);
	}

	@Override
	public Iterable<Customersupport> findAllUsers() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	@Override
	public void updateList(Customersupport css) {
		// TODO Auto-generated method stub
		System.out.println(repos.save(css));
		
	}

}
