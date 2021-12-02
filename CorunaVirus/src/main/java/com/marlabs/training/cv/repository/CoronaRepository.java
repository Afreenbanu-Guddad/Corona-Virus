package com.marlabs.training.cv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marlabs.training.cv.entity.Corona;

@Repository
public interface CoronaRepository extends JpaRepository<Corona,String> {
	Corona getBystatename(String statename);

	Corona save(List<Integer> values);

}
