package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		try{
			rep.save(student);
		return student;}
		catch(Exception e) {
			e.printStackTrace();
		}return null;
	}
	@GetMapping("/details")
	public List<Student> getAllUsers(){
		try {
		return rep.findAll();}
		catch(Exception e) {
			e.printStackTrace();
		}return null;
		
	}
	

		@SuppressWarnings("deprecation")
		@DeleteMapping("/delete")
		public String del (@PathVariable int Id) {
			try {
		
			Student student=rep.getOne(Id);
			rep.delete(student);
			return "Deleted";
			}
			catch(Exception e) {
				e.printStackTrace();
			}return null;
		}
		@PutMapping("/update")
		public Student update(@RequestBody Student student) {
			try {
			rep.save(student);
			return student;
			}
			catch(Exception e) {
				e.printStackTrace();
			}return null;
		}
	
}


