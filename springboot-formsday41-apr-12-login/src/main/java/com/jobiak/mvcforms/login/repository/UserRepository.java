package com.jobiak.mvcforms.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.mvcforms.login.model.User;

@Repository  //CRUD operations
public interface UserRepository extends JpaRepository<User,String>{
	
	
	

}
