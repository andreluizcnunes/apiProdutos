package br.apiprodutos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import br.apiprodutos.dto.ProdutoDTO;
import br.apiprodutos.dto.ProdutoMinDTO;
import br.apiprodutos.entities.Produto;
import br.apiprodutos.projections.ProdutoMinProjection;
import br.apiprodutos.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	public ProdutoRepository produtoRepository;
	
	@Transactional(readOnly = true)
	public ProdutoDTO findById(@PathVariable Long id) {
		Produto result = produtoRepository.findById(id).get();
		ProdutoDTO dto = new ProdutoDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<ProdutoMinDTO> findAll(){
		List<Produto> result = produtoRepository.findAll();
		return result.stream().map(x -> new ProdutoMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<ProdutoMinDTO> findByCategoria(Long categoriaId){
		List<ProdutoMinProjection> result = produtoRepository.searchByList(categoriaId);
		return result.stream().map(x -> new ProdutoMinDTO(x)).toList();
	}
}
