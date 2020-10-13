package com.felipesalles.gestorlanchonete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipesalles.gestorlanchonete.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
