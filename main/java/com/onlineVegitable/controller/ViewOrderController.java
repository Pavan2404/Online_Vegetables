package com.onlineVegitable.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineVegitable.modal.ViewOrder;
import com.onlineVegitable.service.ViewOrderService;


@Controller
@RestController
@RequestMapping("/api/ViewOrder")
public class ViewOrderController {
	@Autowired
	private ViewOrderService vos;
	@PostMapping("/save/ViewOrder")
	public ViewOrder saveOrder(@RequestBody ViewOrder vo) {
		return vos.saveOrder(vo);
	}
	
	@GetMapping("/getOrderDetails/ViewOrder")
	public Optional<ViewOrder> getOrderDetails(@PathVariable Integer vo){
		return vos.getOrdweDetails(vo);
	}
}
