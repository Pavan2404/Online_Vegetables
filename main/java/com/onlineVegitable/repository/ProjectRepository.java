package com.onlineVegetable.repository;

import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

import com.onlineVegetable.modal.Project;
@Repository
public interface ProjectRepository extends CrudRepository<Project,Long>{

}
