package com.travel.planner.api.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.planner.api.model.Packages;
import com.travel.planner.api.repo.PackagesRepository;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api")
public class PackagesApi {
	
	@Autowired
    PackagesRepository packagesRepo;
	
	@GetMapping(value = "/getPackages")
	public List<Packages> getPackages() {
		return packagesRepo.findAll();
	}
	
	@PostMapping(value = "/createPackages")
	public @Valid Packages createEngMovies(@Valid @RequestBody Packages packages) {
		
		long totalPrice = packages.getAccomodation() + packages.getFood() + packages.getTransportation();
	    packages.setTotalPrice(totalPrice);
	    return packagesRepo.save(packages);
	}
	
	@GetMapping("/getPackages/{id}")
	public Packages getById(@PathVariable(required = true) long id) {

		return packagesRepo.getById(id);
	}
	
	@PutMapping("/updatePackages/{id}")
	public @Valid Packages updatePackages(@PathVariable(value = "id") Long Id, @Valid @RequestBody Packages Packages) {
		 Packages updatedNote = packagesRepo.save(Packages);
		return updatedNote;
	}

	@DeleteMapping("/deletePackages/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long Id) {
		packagesRepo.deleteById(Id);
		return ResponseEntity.ok().build();
	}

}
