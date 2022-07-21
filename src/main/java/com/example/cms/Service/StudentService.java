package com.example.cms.Service;

import java.util.List;

import com.example.cms.Entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);

	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}

