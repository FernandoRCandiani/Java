package com.ecommerce.loja.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.ecommerce.loja.model.Loja;
import com.ecommerce.loja.repository.LojaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/loja")
public class LojaController {
	
	@Autowired
	private LojaRepository repository;
	
	@GetMapping
	private ResponseEntity<List<Loja>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("{id}")
	private ResponseEntity<Loja> GetyId(@PathVariable Long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("nomeLoja/{nomeLoja}")
	private ResponseEntity<List<Loja>> GetByLoja(@PathVariable String nomeLoja){
		return ResponseEntity.ok(repository.findAllByNomeLojaContainingIgnoreCase(nomeLoja));
	}
	
	@GetMapping("descricao/{descricao}")
	private ResponseEntity<List<Loja>> GetByDescricao(@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping
	private ResponseEntity<Loja> Post(@RequestBody Loja loja){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(loja));
	}
	
	@PutMapping
	private ResponseEntity<Loja> Put(@RequestBody Loja loja){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(loja));
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}