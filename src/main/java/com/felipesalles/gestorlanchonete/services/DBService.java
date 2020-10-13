package com.felipesalles.gestorlanchonete.services;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.felipesalles.gestorlanchonete.domain.Categoria;
import com.felipesalles.gestorlanchonete.domain.Celular;
import com.felipesalles.gestorlanchonete.domain.Cliente;
import com.felipesalles.gestorlanchonete.domain.PagamentoComCartaoCredito;
import com.felipesalles.gestorlanchonete.domain.PagamentoComCartaoDebito;
import com.felipesalles.gestorlanchonete.domain.PagamentoComDinheiro;
import com.felipesalles.gestorlanchonete.domain.Pedido;
import com.felipesalles.gestorlanchonete.domain.Produto;
import com.felipesalles.gestorlanchonete.repositories.CategoriaRepository;
import com.felipesalles.gestorlanchonete.repositories.CelularRepository;
import com.felipesalles.gestorlanchonete.repositories.ClienteRepository;
import com.felipesalles.gestorlanchonete.repositories.PagamentoRepository;
import com.felipesalles.gestorlanchonete.repositories.PedidoRepository;
import com.felipesalles.gestorlanchonete.repositories.ProdutoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DBService {

	private final CategoriaRepository categoriaRepository;
	
	private final ProdutoRepository produtoRepository;
	
	private final CelularRepository celularRepository;
	
	private final ClienteRepository clienteRepository;
	
	private final PedidoRepository pedidoRepository;
	
	private final PagamentoRepository pagamentoRepository;
	
	public void instantiateDatabase() throws Exception {
		var c1 = new Categoria(null, "Hamburguer");
		var c2 = new Categoria(null, "Bebida");
		var c3 = new Categoria(null, "Outros");
		
		
		
		var p1 = new Produto(null, "X-burguer", 10.00);
		var p2 = new Produto(null, "X-egg", 11.00);
		var p3 = new Produto(null, "X-bacon", 12.00);
		var p4 = new Produto(null, "X-tudo", 13.00);
		var p5 = new Produto(null, "Coca-cola 1,5l", 8.00);
		var p6 = new Produto(null, "Suco de laranja", 6.50);
		
		p1.getCategorias().add(c1);
		p2.getCategorias().add(c1);
		p3.getCategorias().add(c1);
		p4.getCategorias().add(c1);
		p5.getCategorias().add(c2);
		p6.getCategorias().add(c2);
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
		
		c1.getProdutos().addAll(Arrays.asList(p1, p2, p3, p4));
		c2.getProdutos().addAll(Arrays.asList(p5, p6));
		
		
		categoriaRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		var cel1 = new Celular(null, "27", "99999999", null);
		var cel2 = new Celular(null, "27", "99999998", null);
		var cel3 = new Celular(null, "27", "99999997", null);
		var cel4 = new Celular(null, "27", "99999996", null);
		var cel5 = new Celular(null, "27", "99999995", null);
		
		var cli1 = new Cliente(null, "Ana", "Torres", cel1);
		var cli2 = new Cliente(null, "Bruno", "Barros", cel2);
		var cli3 = new Cliente(null, "Carla", "Vargas", cel3);
		var cli4 = new Cliente(null, "Davi", "Chagas", cel4);
		var cli5 = new Cliente(null, "Eduarda", "Prado", cel5);
		
		cel1.setCliente(cli1);
		cel2.setCliente(cli2);
		cel3.setCliente(cli3);
		cel4.setCliente(cli4);
		cel5.setCliente(cli5);
		
		celularRepository.saveAll(Arrays.asList(cel1, cel2, cel3, cel4, cel5));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		var ped1 = new Pedido(null, sdf.parse("13/10/2020 21:30:12"), cli1);
		var ped2 = new Pedido(null, sdf.parse("13/10/2020 21:35:44"), cli2);
		var ped3 = new Pedido(null, sdf.parse("13/10/2020 21:37:12"), cli3);
		var ped4 = new Pedido(null, sdf.parse("13/10/2020 21:42:08"), cli4);
		var ped5 = new Pedido(null, sdf.parse("13/10/2020 21:48:55"), cli5);
		var ped6 = new Pedido(null, sdf.parse("13/10/2020 21:56:12"), cli2);
		
		var pagto1 = new PagamentoComDinheiro(null, ped1);
		var pagto2 = new PagamentoComCartaoCredito(null, ped2);
		var pagto3 = new PagamentoComCartaoDebito(null, ped3);
		var pagto4 = new PagamentoComCartaoDebito(null, ped4);
		var pagto5 = new PagamentoComDinheiro(null, ped5);
		var pagto6 = new PagamentoComCartaoCredito(null, ped6);
		
		ped1.setPagamento(pagto1);
		ped2.setPagamento(pagto2);
		ped3.setPagamento(pagto3);
		ped4.setPagamento(pagto4);
		ped5.setPagamento(pagto5);
		ped6.setPagamento(pagto6);
		
		cli1.getPedidos().add(ped1);
		cli2.getPedidos().addAll(Arrays.asList(ped2, ped6));
		cli3.getPedidos().add(ped3);
		cli4.getPedidos().add(ped4);
		cli5.getPedidos().add(ped5);
		
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2, ped3, ped4, ped5, ped6));
		pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2, pagto3, pagto4, pagto5, pagto6));
	}
	
}
