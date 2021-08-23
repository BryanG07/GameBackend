
package com.example.games.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.games.model.Game;
import com.example.games.service.GameService;

@RestController
@RequestMapping ("/game/")
public class GameRest {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	private ResponseEntity<List<Game>> getAllGames (){
		return ResponseEntity.ok(gameService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Game>> getAllGamesByThecnology (@PathVariable("id") Long idTechnology){
		return ResponseEntity.ok(gameService.findAllByTecnologia(idTechnology));
	}
	
	/*@GetMapping (path="boolean/{id_n}")
	private ResponseEntity<List<Game>> getAllGamesByBool (@PathVariable("id_n") Long id_nBool){
		return ResponseEntity.ok(gameService.findAllByBooleano(id_nBool));
	}*/
	
	@PostMapping
	private ResponseEntity<Game> saveGame (@RequestBody Game game){
		try {
			Game gameSave = gameService.save(game);		
		return ResponseEntity.created(new URI("/game/"+gameSave.getId())).body(gameSave);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteGame (@PathVariable ("id") Long id){
		gameService.deleteById(id);
		return ResponseEntity.ok(!(gameService.findById(id)!=null));
	}
	
}
