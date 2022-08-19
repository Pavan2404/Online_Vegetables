package com.onlineVegitable.service;

import java.util.Optional;



import com.onlineVegitable.exception.ItemNotFoundException;

import com.onlineVegitable.modal.Addtocart;

public interface AddtocartService {
	public Addtocart saveCart(Addtocart atc);
	public Optional<Addtocart> getCartDetails(Integer qn);
	public Iterable<Addtocart> findAllCartDetails();
	public void updateCart(Addtocart ac);

	public void deleteCart(Integer id);

	public void deleteCart(Integer id) throws ItemNotFoundException;

	

}
