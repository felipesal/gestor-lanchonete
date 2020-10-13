package com.felipesalles.gestorlanchonete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipesalles.gestorlanchonete.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
