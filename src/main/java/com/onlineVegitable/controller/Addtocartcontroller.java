package com.onlineVegitable.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


=======
import com.onlineVegitable.exception.ItemNotFoundException;

import com.onlineVegitable.modal.Addtocart;
import com.onlineVegitable.service.AddtocartService;



=======



@Controller
@RestController
@RequestMapping("/api/Addtocart")
public class Addtocartcontroller {
    @Autowired
    private AddtocartService atcse;
    @PostMapping("/save/Addtocart")
    public Addtocart saveCart(@RequestBody Addtocart atc) {
		// TODO Auto-generated method stub
    	
    	      return atcse.saveCart(atc);
		
	}
    @GetMapping("/getCartDetails/{qn}")
    public Optional<Addtocart> getCartDetails(@PathVariable Integer qn) {
		// TODO Auto-generated method stub
		return atcse.getCartDetails(qn);
	}
    @GetMapping("/Addtocart")
    public Iterable<Addtocart> findAllCartDetails() {
		// TODO Auto-generated method stub
		return atcse.findAllCartDetails();
    	
	}

    @PutMapping("/save/Addtocart")
    public void updateCart(@RequestBody Addtocart ac) {
		// TODO Auto-generated method
		System.out.println(atcse.saveCart(ac));
	}
    @DeleteMapping("/Addtocart/{id}")

    public void deleteCart(@PathVariable Integer id) {
=======
    public void deleteCart(@PathVariable Integer id) throws ItemNotFoundException {

		// TODO Auto-generated method stub
		atcse.deleteCart(id);
		//return new ResponseEntity<String>("cart Id"+id+ "Deleted cart details",HttpStatus.OK);
		
	}


}
