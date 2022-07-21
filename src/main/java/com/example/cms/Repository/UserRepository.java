package com.example.cms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cms.Entity.User;


public interface UserRepository  extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
