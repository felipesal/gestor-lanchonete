package com.felipesalles.gestorlanchonete.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.felipesalles.gestorlanchonete.domain.Produto;
import com.felipesalles.gestorlanchonete.domain.dto.ProdutoNewDTO;
import com.felipesalles.gestorlanchonete.services.ProdutoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/produtos")
public class ProdutoResources {
	
	private final ProdutoService produtoService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Produto> findAll(){
		return produtoService.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Produto findOne(@PathVariable Long id) {
		return produtoService.findOne(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void insertProduto(@RequestBody @Valid ProdutoNewDTO produtoDto) {
		produtoService.insert(produtoDto);
	}
	
}
