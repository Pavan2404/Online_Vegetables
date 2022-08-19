package com.onlineVegitable.service;

import java.util.Optional;

import com.onlineVegitable.exception.OrderNotFoundException;
import com.onlineVegitable.modal.ViewOrder;

public interface ViewOrderService {
	
	public ViewOrder saveOrder(ViewOrder vo);

	public Optional<ViewOrder> getOrdweDetails(Integer vo) throws OrderNotFoundException;

	Iterable<ViewOrder> findAllProject();

	void deleteOrder(int Id);



	public void deleteProjectById(Integer vo) throws OrderNotFoundException;

	public Iterable<ViewOrder> findAllOrder();

}
