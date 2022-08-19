package com.onlineVegitable.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineVegitable.exception.OrderNotFoundException;
import com.onlineVegitable.exception.ProjectIdException;

import com.onlineVegitable.modal.ViewOrder;
import com.onlineVegitable.repository.ViewOrderRepository;

@Service
public class ViewOrderServiceImpl implements ViewOrderService{
	
	@Autowired
	private ViewOrderRepository repos;

	@Override
	public ViewOrder saveOrder(ViewOrder vo) {
		// TODO Auto-generated method stub
		return repos.save(null);
	}

	@Override
	public Optional<ViewOrder> getOrdweDetails(Integer vo) throws OrderNotFoundException  {
		// TODO Auto-generated method stub
		Optional<ViewOrder> Id=repos.findById(vo);
		if(Id==null) {
			throw new OrderNotFoundException (" OrderId :"+vo+"does not exist");
		}
		return repos.findById(vo);
	}
	@Override
	public Iterable<ViewOrder> findAllProject() {
		// TODO Auto-generated method stub

		return null;

		return repos.findAll();

	}

	@Override
	public void deleteOrder(int Id) {
		// TODO Auto-generated method stub
		Optional<ViewOrder> vo=repos.findById(Id);
		if(vo==null) {
			throw new ProjectIdException(" OrderId :"+Id+"does not exist");
		}
		repos.deleteById(Id);
		
		
	}



	@Override
	public void deleteProjectById(Integer vo) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		Optional<ViewOrder> proj=repos.findById(vo);
		if(proj==null) {
			throw new OrderNotFoundException("Order Id :"+vo+"does not exist");
		}
		repos.deleteById(vo);
		
	}

	@Override
	public Iterable<ViewOrder> findAllOrder() {
		// TODO Auto-generated method stub
		return null;
	}


	

	
	
}
