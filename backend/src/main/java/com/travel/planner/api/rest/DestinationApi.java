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

import com.travel.planner.api.model.Destination;
import com.travel.planner.api.repo.DestinationRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api")
public class DestinationApi {
	
	@Autowired
	DestinationRepository DestinationRepo;

	@GetMapping(value = "/getDestination")
	public List<Destination> getDestination() {
		return DestinationRepo.findAll();
	}
	@PostMapping(value = "/createDestination")
	public @Valid Destination createDestination(@Valid @RequestBody Destination Destination) {
		return DestinationRepo.save(Destination);
	}

	@GetMapping("/getDestination/{id}")
	public Destination getById(@PathVariable(required = true) long id) {

		return DestinationRepo.getById(id);
	}

	@PutMapping("/updateDestination/{id}")
	public @Valid Destination updateDestination(@PathVariable(value = "id") Long Id, @Valid @RequestBody Destination Destination) {
		Destination updatedNote = DestinationRepo.save(Destination);
		return updatedNote;
	}

	@DeleteMapping("/deleteDestination/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long Id) {
		DestinationRepo.deleteById(Id);
		return ResponseEntity.ok().build();
	}


}
