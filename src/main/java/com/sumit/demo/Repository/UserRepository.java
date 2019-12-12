package com.sumit.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sumit.demo.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findById(int id);
	public User findByUsernameAndPassword(String username, String password);
	public User findByUsername(String username);

}

