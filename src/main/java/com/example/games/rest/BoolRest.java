package com.example.games.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.games.model.Bool;
import com.example.games.service.BoolService;

@RestController
@RequestMapping ("/bool/")
public class BoolRest {

	private BoolService boolService;
	
	@GetMapping
	private ResponseEntity<List<Bool>> getAllBools (){
		return ResponseEntity.ok(boolService.findAll());
	}
}
