package com.felipesalles.gestorlanchonete.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import com.felipesalles.gestorlanchonete.domain.Categoria;

public class CategoriaNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String nome;

	public CategoriaNewDTO() {
		super();
	}

	public CategoriaNewDTO(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Categoria fromDto() {
		return new Categoria(null, getNome());
	}
	
}
