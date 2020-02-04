package com.example.demo.dto;

import org.mapstruct.Mapper;

import com.example.demo.entity.Student;

@Mapper

public interface StudentMapper {
	public Student studentDtoToStudent(StudentDto dto);
	public StudentDto studentToStudentDto(Student student);
}
