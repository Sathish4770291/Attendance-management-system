package com.example.cms.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cms.Entity.Student;
import com.example.cms.Repository.StudentRepository;
import com.example.cms.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	
		
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
