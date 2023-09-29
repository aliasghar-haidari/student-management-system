package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student Student);
	Student updateStudent(Student student);
	Student getStudentById(Long id);
	void deleteStudent(Long id);
}
