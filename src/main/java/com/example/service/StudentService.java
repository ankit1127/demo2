package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

//we write our business logic or whatever we perform on database insert update delete
//in service layer

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		//find all jpa rep //select * from student
		return studentRepository.findAll();
		//list of entity class
		//for each record one object
		//List of records
	}
	
}
