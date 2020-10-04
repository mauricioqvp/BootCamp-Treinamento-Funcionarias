package com.devsuperior.treinoFuncionarias.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.treinoFuncionarias.entities.Funcionarias;
import com.devsuperior.treinoFuncionarias.repositories.FuncionariasRepository;

@Service
public class FuncionariasService {
	
	@Autowired
	private FuncionariasRepository repository;
	
	public List<Funcionarias> findAll(){
		return repository.findAll();
	}

}
