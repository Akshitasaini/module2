package com.example.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.CD;

@Controller
@RequestMapping("/cd")
public class CDController {
@RequestMapping(method = RequestMethod.GET,path="/showForm")
public String showFormForAdd()
{
	return "add-cd";
}
@RequestMapping("/processForm")
public String processForm(@RequestParam("title") String title,
		@RequestParam("type") String type,
		@RequestParam("year")String year,Model theModel)
{
LocalDate date = LocalDate.now();
	CD cd=new CD(title,type,year,date);
	theModel.addAttribute("cd",cd);

	return "success";
}
}
