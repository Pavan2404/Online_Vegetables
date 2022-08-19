package com.onlineVegitable.service;

import com.onlineVegitable.modal.Vegetable;

public interface AdminService {
	public Vegetable saveOrUpdate(Vegetable project);
	public Vegetable findProjectByVegetableIdentifier(String vegetableId);
	public Iterable<Vegetable>  findAllProject();
	public void deleteProjectByVegetableIdentifier(String vegetableId);
}
