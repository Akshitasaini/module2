package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.error.ErrorMessage;
import com.example.demo.error.StudentNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	private StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError1(StudentNotFoundException bne) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(bne.getMessage());
		errorMessage.setStatus(HttpStatus.NOT_FOUND.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError2(Exception e) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(e.getMessage());
		errorMessage.setStatus(HttpStatus.BAD_REQUEST.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/students")
	public List<Student> getAll() {

		return studentService.getAllStudents();
	}

	@GetMapping("/students/{studentId}")
	public Optional<Student> getStudentById(@PathVariable Integer studentId) throws Exception {
		Optional<Student> student = studentService.getStudentById(studentId);
		if (!student.isPresent()) {
			throw new StudentNotFoundException("STUDENT NOT FOUND WITH ID: " + studentId);
		}
		return student;
	}

	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
student.setStudentId(0);
return studentService.createStudent(student);
}
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	@DeleteMapping("/students/{studentId}")
	public void deleteById(@PathVariable Integer studentId)
	{
		studentService.deleteStudentById(studentId);
	}
	@DeleteMapping("/students")
	public void deleteAll()
	{
		studentService.deleteAll();
	}
	@GetMapping("/students/findByFirstName/{firstName}")
	public List<Student> findByFirstName(@PathVariable String firstName)
	{
		return studentService.findByFirstName(firstName);
	}
	@GetMapping("/students/findByLastName/{lastName}")
	public List<Student> findByLastName(@PathVariable String lastName)
	{
		return studentService.findByLastName(lastName);
	}
	@GetMapping("/students/findByFisrtNameAndLastName/{firstName}/{lastName}")
	public List<Student> findByName(@PathVariable String firstName,@PathVariable String lastName)
	{
		return studentService.findByFirstNameAndLastName(firstName, lastName);
	}
}
