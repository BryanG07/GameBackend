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

import com.example.games.model.Client;
import com.example.games.service.ClientService;

@RestController
@RequestMapping("/client/")
public class ClientRest {

	@Autowired
	private ClientService clientService;
	
	@GetMapping
	private ResponseEntity<List<Client>> getAllClients (){
		return ResponseEntity.ok(clientService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Client> saveClient (@RequestBody Client client){
		
		try {
			Client clientGuardado = clientService.save(client);
			return ResponseEntity.created(new URI("/client/"+clientGuardado.getId())).body(clientGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();		
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteClient (@PathVariable ("id") Long id){
		clientService.deleteById(id);
		return ResponseEntity.ok(!(clientService.findById(id)!=null));
	}
	
}
