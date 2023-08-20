package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	// Handler method to handle list of students and return view
	@GetMapping("/students")
	public String listStudnts(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
}
