package com.onlineVegitable.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineVegitable.modal.Customersupport;
import com.onlineVegitable.service.CustomersupportService;


@Controller
@RestController
@RequestMapping("/api/Customersupport")
public class CustomersupportController {
	
	@Autowired
	private CustomersupportService csse;
	
	
	@GetMapping("/getMsgsDetails/{Id}")
	public Optional<Customersupport> getSuggDetails(@PathVariable Integer Id) {
		// TODO Auto-generated method stub
		return csse.getMsgsDetails(Id);
		}

}
