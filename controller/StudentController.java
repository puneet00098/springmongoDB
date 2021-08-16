package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	/**
	 * end-point for creating student record
	 * @param student
	 * @return
	 */
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		//in usually there will be student request and response class.
		//there for simplicity we are directly passing entity object.
		return studentService.createStudent(student);
	}
	
	/**
	 * This end point is for getting student by Id.	
	 * @param id
	 * @return
	 */
	@GetMapping("/getById/{id}")
	public Student getStudentById(@PathVariable String  id) {
		
		return studentService.getStudentById(id);
	}
	
	/**
	 * End point to get all students List
	 * @return
	 */
	@GetMapping("/all")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	
	/**
	 * This end point is going to update
	 * @param student
	 * @return
	 */
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
	/**
	 * This end point is going to delete student document by Id.
	 * @param id
	 * @return
	 */
	@DeleteMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable String  id) {
		return studentService.deleteStudentById(id);
	}
	
	/**
	 * This end point returns list of Students by Name
	 * @param name
	 * @return
	 */
	@GetMapping("/getStudentByName/{name}")
	public List<Student> getStudentByName(String name){
		return studentService.findByName(name);
	}
	
	
	/**
	 * the is method for testing API is up.
	 * @return
	 */
	@GetMapping("/")
	public String getDummy() {
		return "Hello! I am working.";
	}

}
