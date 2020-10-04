package com.devsuperior.treinoFuncionarias.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.treinoFuncionarias.entities.Funcionarias;

@Repository
public interface FuncionariasRepository extends JpaRepository<Funcionarias, Long>{

}
