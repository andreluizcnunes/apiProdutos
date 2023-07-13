package br.apiprodutos.dto;

import br.apiprodutos.entities.Categoria;

public class CategoriaDTO {
	
	private Long id;
	private String nomeCategoria;
	
	public CategoriaDTO() {
	}

	public CategoriaDTO(Categoria entity) {
		id = entity.getId();
		nomeCategoria = entity.getNomeCategoria();
	}

	public Long getId() {
		return id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}
	
	
	
	
	
	
}
