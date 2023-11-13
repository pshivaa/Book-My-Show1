package com.CarProject.SemiProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.CarProject.SemiProject.Entity.FinalConfirm;

@CrossOrigin("*")
public interface FinalRecodRepository extends JpaRepository<FinalConfirm, Integer> {

	
}
