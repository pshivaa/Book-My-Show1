package com.CarProject.SemiProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.CarProject.SemiProject.Entity.CarInfo;

@CrossOrigin("*")
public interface CarInfoRepository extends JpaRepository<CarInfo,Integer> {

}
