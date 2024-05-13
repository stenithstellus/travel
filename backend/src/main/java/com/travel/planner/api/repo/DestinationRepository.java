package com.travel.planner.api.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.planner.api.model.Destination;



public interface DestinationRepository extends JpaRepository<Destination, Long> {

	void deleteById(Optional<Destination> note);

	Destination getById(long id);

}