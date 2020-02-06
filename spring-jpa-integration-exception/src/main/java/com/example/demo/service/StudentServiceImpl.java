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
	/*@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}*/
	@Override
	public void deleteStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		studentDao.deleteById(studentId);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		studentDao.deleteAll();
	}
	@Override
	public List<Student> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return studentDao.findByFirstName(firstName);
	}
	@Override
	public List<Student> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return studentDao.findByLastName(lastName);
	}
	@Override
	public List<Student> findByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return studentDao.findByFirstNameAndLastName(firstName, lastName);
	}

}
