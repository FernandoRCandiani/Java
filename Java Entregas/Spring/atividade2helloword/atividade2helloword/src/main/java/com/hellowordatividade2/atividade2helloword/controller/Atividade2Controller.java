package com.hellowordatividade2.atividade2helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloatividade2")
public class Atividade2Controller {
	
	@GetMapping
	public String helloatividade2() {
		return "Meus objetivos nesta semana aprender mais sobre Java e me dedicar nos trabalho em grupo.";
	}
	
}
