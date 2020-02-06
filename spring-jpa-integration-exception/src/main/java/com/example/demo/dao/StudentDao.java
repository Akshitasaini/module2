package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
@Repository
@Transactional
public interface StudentDao extends JpaRepository<Student, Integer> {
	public List<Student> findByFirstName(String firstName);
	public List<Student> findByLastName(String lastName);
	
	public List<Student> findByFirstNameAndLastName(String firstName,String lastName);
}

