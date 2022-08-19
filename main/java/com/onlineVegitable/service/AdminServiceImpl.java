package com.onlineVegitable.service;

import org.springframework.beans.factory.annotation.Autowired;



//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.onlineVegitable.exception.ProjectIdException;
import com.onlineVegitable.modal.Vegetable;
import com.onlineVegitable.repository.VegetableRepository;



@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private VegetableRepository projectRepository;
	@Override
	public Vegetable saveOrUpdate(Vegetable project) {
		// TODO Auto-generated method stub
		//return projectRepository.save(project);
		try {
			
			project.setVegetableIdentifier(project.getVegetableIdentifier().toUpperCase());
			return projectRepository.save(project);
		}catch(Exception ex) {
			throw new ProjectIdException("Vegetable Id :"+project.getVegetableIdentifier().toUpperCase()+"already exist");
		}
		}
	@Override
	public Vegetable findProjectByVegetableIdentifier(String vegetableId) {
		Vegetable project=projectRepository.findByVegetableIdentifier(vegetableId.toUpperCase());
		if(project==null) {
			throw new ProjectIdException("Vegetable Identifier :"+vegetableId.toUpperCase()+"does not exist");
		}
		return null;
	}
	@Override
	public Iterable<Vegetable> findAllProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}
	@Override
	public void deleteProjectByVegetableIdentifier(String vegetableId) {
		Vegetable project=projectRepository.findByVegetableIdentifier(vegetableId);
		if(project==null) {
			throw new ProjectIdException("vegetableIdegetable Identifier :"+vegetableId.toUpperCase()+"does not exist");
		}
		projectRepository.delete(project);
		
		
	}


	}


