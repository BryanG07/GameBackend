package com.example.games.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.games.model.Technology;
import com.example.games.service.TechnologyService;

@RestController
@RequestMapping ("/technology/")
public class TechnologyRest {
	
	@Autowired
	private TechnologyService technologyService;
	
	/*@GetMapping ("{id}")
	private ResponseEntity<List<Technology>> getAllTechnologiesByGame (@PathVariable("id") Long idGame){
		return ResponseEntity.ok(technologyService.findAllByGame(idGame));
	}*/
	
	@GetMapping
	private ResponseEntity<List<Technology>> getAllTechnologies (){
		return ResponseEntity.ok(technologyService.findAll());
	}
	
}
