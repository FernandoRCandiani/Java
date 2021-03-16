package com.helloworldatividade1.atividade1helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloatividade1")
public class Atividade1Controller {
	
	@GetMapping
	public String helloatividade1() {
		return "Utilizamos uma plataforma Spring para criação "
				+ "de aplicações escritas em java, com isso facilitou em muito para "
				+ "montatagem para os densenvevodores, as habilidades e mentalidades "
				+ "utilizadas foram atenção ao detalhes.";
				
	}
}
