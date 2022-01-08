package com.example.demo.repos;

import com.example.demo.models.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {
public List<Project> findAll();
}
