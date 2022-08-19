package com.onlineVegitable.controller;


import java.util.HashMap;


import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineVegitable.modal.Vegetable;
import com.onlineVegitable.service.AdminService;
import com.onlineVegitable.service.MapValidatonErrorService;




@CrossOrigin
@RestController
@RequestMapping("/api/projects")
public class AdminController {
	@Autowired
	private AdminService projectService;
	@Autowired
	private MapValidatonErrorService mapValidationErrorService;
	@PostMapping("")
	public ResponseEntity<?> createNewProject(@Valid @RequestBody Vegetable project,BindingResult result) {
		ResponseEntity<?> errorMap=mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null)return errorMap;
		Vegetable savedProject = projectService.saveOrUpdate(project);
		return new ResponseEntity<Vegetable>(savedProject,HttpStatus.CREATED);
	}
	@GetMapping("/{vegetableId}")
	public ResponseEntity<?> getProjectById(@PathVariable String vegetableId ){
		Vegetable project =projectService.findProjectByVegetableIdentifier(vegetableId);
		return new ResponseEntity<Vegetable>(project,HttpStatus.OK);
		
	}
	@GetMapping("/all")
	public Iterable<Vegetable> getAllProjects(){
		return projectService.findAllProject();
	}
	@DeleteMapping("/{vegetableId}")
	public ResponseEntity<?> deleteProject(@PathVariable String vegetableId){
		projectService.deleteProjectByVegetableIdentifier(vegetableId);
		return new ResponseEntity<String>("Schedule with ID : "+vegetableId.toUpperCase()+"Deleted Successfully",HttpStatus.OK);
		
	}
}
