package com.felipesalles.gestorlanchonete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipesalles.gestorlanchonete.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>  {

}
