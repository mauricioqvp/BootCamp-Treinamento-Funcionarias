package com.devsuperior.treinoFuncionarias.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.treinoFuncionarias.dto.FuncionariasDTO;
import com.devsuperior.treinoFuncionarias.entities.Funcionarias;
import com.devsuperior.treinoFuncionarias.repositories.FuncionariasRepository;
import com.devsuperior.treinoFuncionarias.services.exceptions.ResourceNotFoundException;

@Service
public class FuncionariasService {
	
	@Autowired
	private FuncionariasRepository repository;
	
	public List<Funcionarias> findAll(){
		return repository.findAll();
	}

	@Transactional(readOnly = true)
	public FuncionariasDTO findById(Long id) {
		Optional<Funcionarias> obj = repository.findById(id);
		Funcionarias entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontada"));
		return new FuncionariasDTO(entity);
	}
	
	@Transactional
	public FuncionariasDTO insert(FuncionariasDTO dto) {
		Funcionarias entity = new Funcionarias();
		entity.setName(dto.getName());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity = repository.save(entity);
		return new FuncionariasDTO(entity);
	}
}
