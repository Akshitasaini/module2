package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;

public interface StudentService {
public List<Student> getAllStudents();
public Optional<Student> getStudentById(Integer studentId);
public Student createStudent(Student student);
//public Student updateStudent(Student student);
public void deleteStudentById(Integer studentId);
public void deleteAll();
public List<Student> findByFirstName(String firstName);
public List<Student> findByLastName(String lastName);

public List<Student> findByFirstNameAndLastName(String firstName,String lastName);
}
