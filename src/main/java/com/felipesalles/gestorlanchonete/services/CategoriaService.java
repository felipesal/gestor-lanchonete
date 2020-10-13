package com.felipesalles.gestorlanchonete.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.felipesalles.gestorlanchonete.domain.Categoria;
import com.felipesalles.gestorlanchonete.domain.dto.CategoriaNewDTO;
import com.felipesalles.gestorlanchonete.repositories.CategoriaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CategoriaService {
	
	private final CategoriaRepository categoriaRepository;
	
	
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}

	public Categoria findOne(Long id) {
		return categoriaRepository.findById(id).get();
	}
	
	public void insert(CategoriaNewDTO categoriaDto) {
		Categoria categoria = categoriaDto.fromDto();
		
		categoriaRepository.save(categoria);
	}
	
}
