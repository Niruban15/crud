package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.Repo;


@RestController
public class controller {
	
	@Autowired
	public Repo rep;
	
	@PostMapping("/newdata")
	public Student adddata(@RequestBody Student student){
		rep.save(student);
		return student;
	}
	@GetMapping("/details")
	public List<Student> getAllUsers(){
		return rep.findAll();
	
}
}

