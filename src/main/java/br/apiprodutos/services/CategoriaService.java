package br.apiprodutos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.apiprodutos.dto.CategoriaDTO;
import br.apiprodutos.entities.Categoria;
import br.apiprodutos.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	public CategoriaRepository categoriaRepository;
	
	@Transactional(readOnly = true)
	public List<CategoriaDTO> findAll(){
		List<Categoria> result = categoriaRepository.findAll();
		return result.stream().map(x -> new CategoriaDTO(x)).toList();
	}
}
