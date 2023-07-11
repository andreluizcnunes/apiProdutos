package br.apiprodutos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.apiprodutos.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
