package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student Student);
}
