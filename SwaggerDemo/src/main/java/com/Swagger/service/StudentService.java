package com.Swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Swagger.model.Student;
import com.Swagger.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	
	public Student createStudent(Student student) {
		return repo.save(student);
	}
	
	public Optional<Student> getById(int id){
		return repo.findById(id);
		
	}
	
	public List<Student> getAllStudent(){
		return repo.findAll();
	}
	
	public String deleteById(int id) {
		 repo.deleteById(id);
		 return "deleted" + id;
	}

}
