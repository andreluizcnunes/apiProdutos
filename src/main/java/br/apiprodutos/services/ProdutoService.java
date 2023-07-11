package br.apiprodutos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.apiprodutos.dto.ProdutoMinDTO;
import br.apiprodutos.entities.Produto;
import br.apiprodutos.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	public ProdutoRepository produtoRepository;
	
	public List<ProdutoMinDTO> findAll(){
		List<Produto> result = produtoRepository.findAll();
		return result.stream().map(x -> new ProdutoMinDTO(x)).toList();
	}
}
