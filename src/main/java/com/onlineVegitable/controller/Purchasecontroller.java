package com.onlineVegitable.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineVegitable.exception.ItemNotFoundException;
import com.onlineVegitable.modal.Purchase;
import com.onlineVegitable.service.PurchaseService;




@Controller
@RestController
@RequestMapping("/api/Purchase")
public class Purchasecontroller {
	@Autowired
	private PurchaseService purchasese;
	@PostMapping("save/Purchase")
	public Purchase savePurchase(@RequestBody Purchase purc) {
		// TODO Auto-generated method stub
		
		return purchasese.savePurchase(purc);
	}

	@GetMapping("/getPurchaseDetails/{bg}")
	public Optional<Purchase> getPurchaseDetails(@PathVariable Integer bg) {
		// TODO Auto-generated method stub
		return purchasese.getPurchaseDetails(bg);}
	@GetMapping("/Purchase")
	public Iterable<Purchase> findAllDetails() {
		// TODO Auto-generated method stub
		return purchasese.findAllDetails();
	}
	@PutMapping("/save/Purchase")

	public void updatePurchase(@RequestBody Purchase pur) {
		// TODO Auto-generated method stub
		System.out.println(purchasese.savePurchase(pur));
		
	}
	@DeleteMapping("/Purchase/{id}")
	public void deletePurchase(@PathVariable Integer id) throws ItemNotFoundException {
		// TODO Auto-generated method stub
		purchasese.deletePurchase(id);;
		
		
	}

	}
	
