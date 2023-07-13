package br.apiprodutos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.apiprodutos.dto.CategoriaDTO;
import br.apiprodutos.dto.ProdutoMinDTO;
import br.apiprodutos.services.CategoriaService;
import br.apiprodutos.services.ProdutoService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {
	
	@Autowired
	public CategoriaService categoriaService;
	
	@Autowired
	public ProdutoService produtoService;
	
	
	@GetMapping
	public List<CategoriaDTO> findAll(){
		List<CategoriaDTO> result = categoriaService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{categoriaId}/produtos")
	public List<ProdutoMinDTO> findByCategoria(@PathVariable Long categoriaId){
		List<ProdutoMinDTO> result = produtoService.findByCategoria(categoriaId);
		return result;
	}
}
