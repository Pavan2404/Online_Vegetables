package com.onlineVegitable.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineVegitable.modal.Addtocart;

import com.onlineVegitable.repository.AddtocartRepository;

@Service
public class AddtocartServiceImpl implements AddtocartService{
	@Autowired
	private  AddtocartRepository repo;

	@Override
	public Addtocart saveCart(Addtocart atc) {
		// TODO Auto-generated method stub
      return repo.save(atc);
		
	}

	@Override
	public Optional<Addtocart> getCartDetails(Integer qn) {
		// TODO Auto-generated method stub
		return repo.findById(qn);
	}

	@Override
	public Iterable<Addtocart> findAllCartDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateCart(Addtocart ac) {
		// TODO Auto-generated method
		System.out.println(repo.save(ac));
	}

	@Override
	public void deleteCart(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	

}
