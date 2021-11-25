package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	//create a student.
	//insert method will create a document with no ID.
	public Student createStudent(Student student) {
		//student here is request pay load
		System.out.println("Student is: "+student);
		return studentRepository.insert(student);
	}
	
	//get student by Id
	public Student getStudentById(String id) {
		
		return studentRepository.findById(id).get();
	}
	
	//to fetch all students
	public List<Student> getAllStudents(){
		
		return studentRepository.findAll();
	}
	
	//update a student document 
	//save method in mongodb repository provide both insert and update function.
	//insert method will only create a document which has no id else it will 
	//throw duplicate key exception.
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	//delete a student document
	//@throws IllegalArgumentException if id is null
	public String deleteStudentById(String id) {
		String response =new  String();
		if(id != null && studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
			response =  id.concat(" is deleted. ");
		}
		else {
			response = "Please check. Either Id is null or does not exists";
		}
		return response;
	}
	
	//find student by Name
	public List<Student> findByName(String name){
		return studentRepository.findByName(name);
	}

}
