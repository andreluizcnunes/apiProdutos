package br.apiprodutos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.apiprodutos.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
