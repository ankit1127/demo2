package com.example.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.response.StudentResponse;
import com.example.service.StudentService;


@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Value("${app.name:Default Demo App}")
	private String appName;
	@GetMapping("/get")
	public StudentResponse getStudent() {
		//getting jason in response
		StudentResponse studentResponse = new StudentResponse(1,"Ritesh","Dutta");
		return studentResponse;
	}
	
	@Autowired
	StudentService studentService;
	@GetMapping("/getAll")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
//	public StudentResponse gettudent() {
//		//getting jason in response
//		StudentResponse studentResponse = new StudentResponse(2,"Rit","Dut");
//		return studentResponse;
//	}
	//@PostMapping
	//@PutMapping
	//@DeleteMapping
//	@PostMapping("/employees")
//	public Employee createEmployee(@Valid @RequestBody Employee employee) {
//	 return employeeRepository.save(employee);
//	}
	
}
