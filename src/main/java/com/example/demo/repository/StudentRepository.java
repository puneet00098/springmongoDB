/**
 * 
 */
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
/*
 * This the repository class for mongoDb. This is a repository interface.
 * To enable a querying to mongoDb the Repository is required.
 * Student <T> is Type --> in The collection and String is Primary Key <ID>  
 */
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

	public  List<Student> findByName(String name);
}
