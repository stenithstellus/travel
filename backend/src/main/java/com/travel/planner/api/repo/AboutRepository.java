package com.travel.planner.api.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.planner.api.model.About;

public interface AboutRepository extends JpaRepository<About, Long> {

	void deleteById(Optional<About> note);

	About getById(long id);

}