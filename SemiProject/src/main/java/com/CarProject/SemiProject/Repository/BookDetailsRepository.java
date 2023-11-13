package com.CarProject.SemiProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.CarProject.SemiProject.Entity.BookDetails;
@CrossOrigin("*")
public interface BookDetailsRepository extends JpaRepository<BookDetails, Integer> {

}
