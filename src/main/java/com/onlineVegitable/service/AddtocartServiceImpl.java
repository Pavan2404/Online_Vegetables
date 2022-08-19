package com.onlineVegitable.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.onlineVegitable.modal.Addtocart;


import com.onlineVegitable.exception.AddtocartIdException;
import com.onlineVegitable.exception.ItemNotFoundException;
import com.onlineVegitable.exception.ProjectIdException;
import com.onlineVegitable.modal.Addtocart;
import com.onlineVegitable.modal.Vegetable;

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

	public Optional<Addtocart> getCartDetails(Integer qn) throws AddtocartIdException{
		// TODO Auto-generated method stub
		Optional<Addtocart> Atc=repo.findById(qn);
		if(Atc==null) {
			throw new AddtocartIdException("Cart with id :"+qn+"does not exist");
		}

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

	public void deleteCart(Integer id) throws ItemNotFoundException {
		Optional<Addtocart> Atc=repo.findById(id);
		if(Atc==null) {
			throw new ItemNotFoundException("Cart with id :"+id+"does not exist");
		}

		repo.deleteById(id);
		
	}

	

}
