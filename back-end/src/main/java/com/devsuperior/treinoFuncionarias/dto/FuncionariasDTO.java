package com.devsuperior.treinoFuncionarias.dto;

import com.devsuperior.treinoFuncionarias.entities.Funcionarias;

public class FuncionariasDTO {
	
	private Long id;
	private String name;
	private String phoneNumber;
	
	public FuncionariasDTO() {
		super();
	}
	
	public FuncionariasDTO(Long id, String name, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public FuncionariasDTO(Funcionarias entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.phoneNumber = entity.getPhoneNumber();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "FuncionariasDTO [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

	
}
