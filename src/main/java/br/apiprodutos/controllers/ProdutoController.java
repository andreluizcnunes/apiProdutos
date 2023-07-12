package br.apiprodutos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.apiprodutos.dto.ProdutoDTO;
import br.apiprodutos.dto.ProdutoMinDTO;
import br.apiprodutos.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
	
	@Autowired
	public ProdutoService produtoService; 
	
	@GetMapping(value =  "/{id}")
	public ProdutoDTO findById(@PathVariable Long id){
		ProdutoDTO result = produtoService.findById(id);
		return result;
	}
	
	@GetMapping
	public List<ProdutoMinDTO> findAll(){
		List<ProdutoMinDTO> result = produtoService.findAll();
		return result;
	}
}
