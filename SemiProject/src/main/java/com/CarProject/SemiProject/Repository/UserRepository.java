package com.CarProject.SemiProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.CarProject.SemiProject.Entity.UserLogin;

@CrossOrigin("*")
public interface UserRepository extends  JpaRepository<UserLogin,Integer>{

	Optional<UserLogin> findByUsername(String username);	
}

