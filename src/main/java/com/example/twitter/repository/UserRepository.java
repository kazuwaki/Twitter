package com.example.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.twitter.repository.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByEmailAndPassword(String email, String password);

}
