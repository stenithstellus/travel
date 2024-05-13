package com.travel.planner.api.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.planner.api.model.Packages;

public interface PackagesRepository extends JpaRepository<Packages, Long> {

	void deleteById(Optional<Packages> note);

	Packages getById(long id);

}
