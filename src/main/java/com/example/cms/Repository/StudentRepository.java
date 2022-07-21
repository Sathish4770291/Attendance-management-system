package com.example.cms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cms.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
