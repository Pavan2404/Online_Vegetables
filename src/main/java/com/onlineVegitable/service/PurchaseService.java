package com.onlineVegitable.service;

import java.util.Optional;


import com.onlineVegitable.exception.ItemNotFoundException;

import com.onlineVegitable.modal.Purchase;

public interface PurchaseService {
	public Purchase savePurchase(Purchase purc);
	public Optional<Purchase> getPurchaseDetails(Integer bg);
	public Iterable<Purchase> findAllDetails();
	public void updatePurchase(Purchase pur);

	public void deletePurchase(Integer id);

	public void deletePurchase(Integer id) throws ItemNotFoundException;


}
