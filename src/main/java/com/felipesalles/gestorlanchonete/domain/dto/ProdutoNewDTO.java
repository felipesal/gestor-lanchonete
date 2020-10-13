package com.felipesalles.gestorlanchonete.domain.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.felipesalles.gestorlanchonete.domain.Categoria;
import com.felipesalles.gestorlanchonete.domain.Produto;

public class ProdutoNewDTO {
	
	@NotEmpty
	private String nome;
	
	@NotNull
	private Double preco;
	
	@NotNull
	private Categoria categoria1;
	
	private Categoria categoria2;
	
	private Categoria categoria3;

	public ProdutoNewDTO() {
		super();
	}

	public ProdutoNewDTO(@NotEmpty String nome, @NotNull Double preco, @NotNull Categoria categoria1) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.categoria1 = categoria1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria1() {
		return categoria1;
	}

	public void setCategoria1(Categoria categoria1) {
		this.categoria1 = categoria1;
	}

	public Categoria getCategoria2() {
		return categoria2;
	}

	public void setCategoria2(Categoria categoria2) {
		this.categoria2 = categoria2;
	}

	public Categoria getCategoria3() {
		return categoria3;
	}

	public void setCategoria3(Categoria categoria3) {
		this.categoria3 = categoria3;
	}
	
	public Produto fromDto() {
		var produto = new Produto(null, getNome(), getPreco());
		produto.getCategorias().add(categoria1);
		
		if(categoria2 != null) {
			produto.getCategorias().add(categoria2);
		}
		
		if(categoria3 != null) {
			produto.getCategorias().add(categoria3);
		}
		
		return produto;
	}
	
}
