package com.felipesalles.gestorlanchonete.domain.enums;



public enum StatusPedido {

	RECEBIDO(1, "Recebido"),
	PREPARANDO(2, "Preparando"),
	ENCERRADO(3, "Encerrado");
	
	
	private int codigo;
	private String descricao;
	
	private StatusPedido(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static StatusPedido toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(StatusPedido x : StatusPedido.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id " + codigo + " inválido.");
	}
	
	
	
}
