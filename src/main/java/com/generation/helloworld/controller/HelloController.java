package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //essa anotação é para indicar que essa classe é uma classe controladora
@RequestMapping ("/hello") //Não deixar espaços em brancos abaixo das anotações
public class HelloController {
	
	@GetMapping
	public String HellowWorld() {
		return "<title> Projeto Generation </title>" + "<font size = 7> Hello Generation";
	}
	
	@GetMapping("/bsm")
	public String Bsm() {
		return "<title> Projeto Generation </title>" + "<font size = 7> <b>Habilidades" + "<font size = 3><br> \t • Trabalho em equipe " + "<font size = 3><br> \t • Orientação ao detalhe" + "<font size = 3><br> \t • Proatividade" + "<font size = 3><br> \t • Comunicação" + "<br><br><font size = 7> <b>Mentalidades" + "<font size = 3><br> \t • Orientação ao Futuro" + "<font size = 3><br> \t • Responsabilidade Pessoal" + "<font size = 3><br> \t • Mentalidade de Crescimento" + "<font size = 3><br> \t • Persistência";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "<title> Projeto Generation </title>" + "<font size = 7> As metas de aprendizado para essa semana são as seguintes:" + "<font size = 4><br>- Aprender mais sobre Spring Boot;" + "<br>- Terminar o módulo de MySQL;" + "<br>- Completar o escopo do projeto integrador.";
	}
}