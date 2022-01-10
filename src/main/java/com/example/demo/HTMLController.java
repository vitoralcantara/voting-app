package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HTMLController {

	@GetMapping("/votacao")
	public String votacao(Model model){
		return "votacao";
	}

    @GetMapping("/")
	public String index(Model model){
		return "index";
	}
	
	@GetMapping("/votocomputado")
	public String votocomputado(Model model){
		return "votocomputado";
	}
	@GetMapping("/chamado")
	public String chamado(Model model){
		return "chamado";
	}
	@GetMapping("/hello")
	public String hello(Model model){
		return "hello";
	}

}
