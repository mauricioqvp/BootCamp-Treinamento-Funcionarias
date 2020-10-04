package com.devsuperior.treinoFuncionarias.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.treinoFuncionarias.entities.Funcionarias;
import com.devsuperior.treinoFuncionarias.services.FuncionariasService;

@RestController
@RequestMapping(value = "/funcionarias")
public class FuncionariasResources {
	
	@Autowired
	private FuncionariasService service;

	@GetMapping
	public ResponseEntity<List<Funcionarias>> findAll(){
		List<Funcionarias> list = new ArrayList<Funcionarias>();
		list.add(new Funcionarias(1L, "Andresa","31-3551-9090"));
		list.add(new Funcionarias(2L, "Alex","31-3551-2232"));
		list.add(new Funcionarias(3L, "Maria José","31-3551-9191"));
		return ResponseEntity.ok().body(list);
	}
}
