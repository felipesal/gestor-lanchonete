package com.felipesalles.gestorlanchonete.domain;

import javax.persistence.Entity;

import com.felipesalles.gestorlanchonete.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComDinheiro extends Pagamento{
	private static final long serialVersionUID = 1L;

	private Double valorRecebido;
	
	private Double valorDoPedido;

	public PagamentoComDinheiro() {
		super();
	}

	public PagamentoComDinheiro(Long id, Pedido pedido) {
		super(id, pedido);
		
	}

	public Double getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(Double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public Double getValorDoPedido() {
		return valorDoPedido;
	}

	public void setValorDoPedido(Double valorDoPedido) {
		this.valorDoPedido = valorDoPedido;
	}
	
	
	
	
	
}
