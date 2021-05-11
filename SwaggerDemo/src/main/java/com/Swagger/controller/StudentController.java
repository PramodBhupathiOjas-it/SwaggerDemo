package com.Swagger.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Swagger.model.Student;
import com.Swagger.service.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Swagger-Student-Controller")
@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@ApiOperation(value = "create student")
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student stud) {
		return service.createStudent(stud);
	}
	
	@ApiOperation(value = "reteriving student by id")
	@GetMapping("getStudent/{id}")
	public Optional<Student> getById(@PathVariable int id){
		return service.getById(id);		
	}
	@ApiOperation(value = "details of all students")
	@GetMapping("/getAll")	
	public List<Student> getAll(){
		return service.getAllStudent();
	}
	
	@ApiOperation(value = "Delete Student")
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}

}
