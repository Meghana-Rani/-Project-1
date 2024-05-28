package com.project.lenskart.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.lenskart.model.Employee;
import com.project.lenskart.model.Review;

public interface ReviewRepository extends CrudRepository<Review, Integer> {
    List<Review> findByProductId(Integer id);

    List<Review> findAllByOrderByIdDesc();
}
