package com.felipesalles.gestorlanchonete.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.felipesalles.gestorlanchonete.domain.Produto;
import com.felipesalles.gestorlanchonete.domain.dto.ProdutoNewDTO;
import com.felipesalles.gestorlanchonete.repositories.ProdutoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {
	
	private final ProdutoRepository produtoRepository;
	
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	public Produto findOne(Long id) {
		return produtoRepository.findById(id).get();
	}
	
	public void insert(ProdutoNewDTO produtoDto) {
		Produto produto = produtoDto.fromDto();
		
		produtoRepository.save(produto);
	}
	
}
