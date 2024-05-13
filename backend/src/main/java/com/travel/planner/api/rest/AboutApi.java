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

import com.travel.planner.api.model.About;
import com.travel.planner.api.repo.AboutRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api")
public class AboutApi {

	@Autowired
	AboutRepository AboutRepo;

	@GetMapping(value = "/getAbout")
	public List<About> getAbout() {
		return AboutRepo.findAll();
	}

	@PostMapping(value = "/createAbout")
	public @Valid About createAbout(@Valid @RequestBody About About) {
		return AboutRepo.save(About);
	}

	@GetMapping("/getAbout/{id}")
	public About getById(@PathVariable(required = true) long id) {

		return AboutRepo.getById(id);
	}

	@PutMapping("/updateAbout/{id}")
	public @Valid About updateAbout(@PathVariable(value = "id") Long Id, @Valid @RequestBody About About) {
		About updatedNote = AboutRepo.save(About);
		return updatedNote;
	}

	@DeleteMapping("/deleteAbout/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long Id) {
		AboutRepo.deleteById(Id);
		return ResponseEntity.ok().build();
	}

}
