package com.felipesalles.gestorlanchonete.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipesalles.gestorlanchonete.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

}
