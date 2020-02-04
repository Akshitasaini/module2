package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
@RequestMapping("/showForm")
public String showForm(Model theModel) {
	theModel.addAttribute("student",new Student());
	return "show-form";
}
@RequestMapping("/processForm")
public String processForm(@ModelAttribute("student") Student student,Model model) {
	model.addAttribute("student",student);
	StudentDao.createStudent(student);
	return "process-form";
}
}

