package com.CarProject.SemiProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.CarProject.SemiProject.Entity.UserBookCar;
@CrossOrigin("*")
public interface BookCarRepository  extends JpaRepository<UserBookCar, Integer> {

}
