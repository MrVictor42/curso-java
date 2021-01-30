package br.com.cod3r.cursojava.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping(path = { "/ola", "/saudacao" })
	public String olar() {
		return "Olá Spring Boot! (GET)";
	}
}
