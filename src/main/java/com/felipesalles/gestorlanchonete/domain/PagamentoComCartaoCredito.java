package com.felipesalles.gestorlanchonete.domain;

import javax.persistence.Entity;

import com.felipesalles.gestorlanchonete.domain.interfaces.TipoCartao;

@Entity
public class PagamentoComCartaoCredito extends Pagamento implements TipoCartao{
	private static final long serialVersionUID = 1L;
	
	private Double limiteDisponivel;
	
	private Double valorDoPpedido;
	
	public PagamentoComCartaoCredito() {
		}

	public PagamentoComCartaoCredito(Long id, Pedido pedido) {
		super(id, pedido);
		
	}

	public Double getLimiteDisponivel() {
		return limiteDisponivel;
	}

	public void setLimiteDisponivel(Double limiteDisponivel) {
		this.limiteDisponivel = limiteDisponivel;
	}

	public Double getValorDoPpedido() {
		return valorDoPpedido;
	}

	public void setValorDoPpedido(Double valorDoPpedido) {
		this.valorDoPpedido = valorDoPpedido;
	}

	@Override
	public void pagamento() {
		// TODO Auto-generated method stub
		
	}
	
	

}
