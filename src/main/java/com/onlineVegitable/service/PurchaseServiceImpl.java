package com.onlineVegitable.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineVegitable.modal.Purchase;
import com.onlineVegitable.repository.PurchaseRepository;
@Service
public class PurchaseServiceImpl implements PurchaseService{

@Autowired
private PurchaseRepository purchaserepos;

	@Override
	public Optional<Purchase> getPurchaseDetails(Integer bg) {
		// TODO Auto-generated method stub
		return purchaserepos.findById(bg);
	}

	@Override
	public Iterable<Purchase> findAllDetails() {
		// TODO Auto-generated method stub
		return purchaserepos.findAll();
	}

	@Override
	public void updatePurchase(Purchase pur) {
		// TODO Auto-generated method stub
		System.out.println(purchaserepos.save(pur));
		
		
		
	}

	@Override
	public void deletePurchase(Integer id) {
		// TODO Auto-generated method stub
		purchaserepos.deleteById(id);
		
		
	}

	@Override
	public Purchase savePurchase(Purchase purc) {
		// TODO Auto-generated method stub
		return purchaserepos.save(purc);
	}

}
