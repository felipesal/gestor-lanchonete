package com.felipesalles.gestorlanchonete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipesalles.gestorlanchonete.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
