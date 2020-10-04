package com.devsuperior.treinoFuncionarias.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.treinoFuncionarias.dto.FuncionariasDTO;
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
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<FuncionariasDTO> findById(@PathVariable Long id) {
		FuncionariasDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<FuncionariasDTO> insert(@RequestBody FuncionariasDTO dto) {
		System.out.println("[45] FuncionariasDTO " + dto);
		dto = service.insert(dto);
		System.out.println("[47] FuncionariasDTO " + dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
