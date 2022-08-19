package com.onlineVegetable.service;

import org.springframework.beans.factory.annotation.Autowired;



//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.onlineVegetable.modal.Project;
import com.onlineVegetable.repository.ProjectRepository;
import com.onlineVegitable.exception.ProjectIdException;



@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	@Override
	public Project saveOrUpdate(Project project) {
		// TODO Auto-generated method stub
		//return projectRepository.save(project);
		try {
			
			project.setVegetableIdentifier(project.getVegetableIdentifier().toUpperCase());
			return projectRepository.save(project);
		}catch(Exception ex) {
			throw new ProjectIdException("Vegetable Id :"+project.getVegetableIdentifier().toUpperCase()+"already exist");
		}
		}
	}


