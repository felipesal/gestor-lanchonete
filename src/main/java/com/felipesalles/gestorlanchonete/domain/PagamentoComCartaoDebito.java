package com.felipesalles.gestorlanchonete.domain;

import javax.persistence.Entity;

import com.felipesalles.gestorlanchonete.domain.interfaces.TipoCartao;

@Entity
public class PagamentoComCartaoDebito extends Pagamento implements TipoCartao {
	private static final long serialVersionUID = 1L;
	
	private Double saldoDisponivel;
	
	private Double valorDoPedido;

	public PagamentoComCartaoDebito() {
		}

	public PagamentoComCartaoDebito(Long id, Pedido pedido) {
		super(id, pedido);
		
	}

	public Double getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(Double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}

	public Double getValorDoPedido() {
		return valorDoPedido;
	}

	public void setValorDoPedido(Double valorDoPedido) {
		this.valorDoPedido = valorDoPedido;
	}

	@Override
	public void pagamento() {
		// TODO Auto-generated method stub
		
	}
	
}
