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

import com.felipesalles.gestorlanchonete.domain.Categoria;
import com.felipesalles.gestorlanchonete.domain.dto.CategoriaNewDTO;
import com.felipesalles.gestorlanchonete.services.CategoriaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categorias")
public class CategoriaResources {
	
	private final CategoriaService categoriaService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Categoria> findAll(){
		return categoriaService.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Categoria findOne(@PathVariable Long id) {
		return categoriaService.findOne(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void insertCategoria(@RequestBody @Valid CategoriaNewDTO categoriaDto) {
		categoriaService.insert(categoriaDto);
	}
	
}
