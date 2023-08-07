package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
	@Id
	
	private int Id;
	private String Name;
	private int Age;
	private int Dob ;
	private String Degree;
	private String Father_name;
	private String Mother_name;
	private int Phone_number; 
	private String Email;
	private String Password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getDob() {
		return Dob;
	}
	public void setDob(int dob) {
		Dob = dob;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public String getFather_name() {
		return Father_name;
	}
	public void setFather_name(String father_name) {
		Father_name = father_name;
	}
	public String getMother_name() {
		return Mother_name;
	}
	public void setMother_name(String mother_name) {
		Mother_name = mother_name;
	}
	public int getPhone_number() {
		return Phone_number;
	}
	public void setPhone_number(int phone_number) {
		Phone_number = phone_number;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Student(int id, String name, int age, int dob, String degree, String father_name, String mother_name,
			int phone_number, String email, String password) {
		super();
		Id = id;
		Name = name;
		Age = age;
		Dob = dob;
		Degree = degree;
		Father_name = father_name;
		Mother_name = mother_name;
		Phone_number = phone_number;
		Email = email;
		Password = password;
	}
	public Student() {
		super();
	
	}
	
	
	
	
	
	
}
