package com.Swagger.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Swagger.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
