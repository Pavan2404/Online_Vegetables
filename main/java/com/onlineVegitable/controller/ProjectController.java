package com.onlineVegetable.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineVegetable.modal.Project;
import com.onlineVegetable.service.MapValidatonErrorService;
import com.onlineVegetable.service.ProjectService;





@RestController
@RequestMapping("/api/projects")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@Autowired
	private MapValidatonErrorService mapValidationErrorService;
	@PostMapping("")
	public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project,BindingResult result) {
		ResponseEntity<?> errorMap=mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null)return errorMap;
		Project savedProject = projectService.saveOrUpdate(project);
		return new ResponseEntity<Project>(savedProject,HttpStatus.CREATED);
	}
}
