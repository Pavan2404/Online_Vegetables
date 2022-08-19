package com.onlineVegitable.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineVegitable.exception.ItemNotFoundException;
import com.onlineVegitable.exception.PurchaseIdException;
import com.onlineVegitable.modal.Addtocart;
import com.onlineVegitable.modal.Purchase;
import com.onlineVegitable.repository.PurchaseRepository;
@Service
public class PurchaseServiceImpl implements PurchaseService{

@Autowired
private PurchaseRepository purchaserepos;

	@Override
	public Optional<Purchase> getPurchaseDetails(Integer bg) throws PurchaseIdException{
		// TODO Auto-generated method stub
		Optional<Purchase> Atc=purchaserepos.findById(bg);
		if(Atc==null) {
			throw new PurchaseIdException("Purchase detail of id :"+bg+"does not exist");
		}
		
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
	public void deletePurchase(Integer id) throws ItemNotFoundException {
		Optional<Purchase> Atc=purchaserepos.findById(id);
		if(Atc==null) {
			throw new ItemNotFoundException("purchase with id :"+id+"does not exist");
		}
		
		purchaserepos.deleteById(id);
		
		
	}

	@Override
	public Purchase savePurchase(Purchase purc) {
		// TODO Auto-generated method stub
		return purchaserepos.save(purc);
	}

}
