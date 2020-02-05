package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@Service
@EnableTransactionManagement
public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	@Autowired
	public StudentServiceImpl(StudentDao studentDao) {
	super();
	this.studentDao=studentDao;
	}
	@Override
	@Transactional
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	@Transactional
	public Optional<Student> getStudentById(Integer studentId) {
		Optional<Student> student = studentDao.findById(studentId);
		return student;
	}
	@Override
	@Transactional
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

}
