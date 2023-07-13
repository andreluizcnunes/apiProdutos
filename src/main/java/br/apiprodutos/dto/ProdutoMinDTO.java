package br.apiprodutos.dto;

import br.apiprodutos.entities.Produto;
import br.apiprodutos.projections.ProdutoMinProjection;

public class ProdutoMinDTO {
	
	private Long id;
	private String nomeProduto;
	private double valorProduto;
	private String unidadeMedidaProduto;
	private String imageUrlProduto;
	
	public ProdutoMinDTO() {
	}

	public ProdutoMinDTO(Produto entity) {
		id = entity.getId();
		nomeProduto = entity.getNomeProduto();
		valorProduto = entity.getValorProduto();
		unidadeMedidaProduto = entity.getUnidadeMedidaProduto();
		imageUrlProduto = entity.getImageUrlProduto();
	}
	
	public ProdutoMinDTO(ProdutoMinProjection projection) {
		id = projection.getId();
		nomeProduto = projection.getNomeProduto();
		valorProduto = projection.getValorProduto();
		unidadeMedidaProduto = projection.getUnidadeMedidaProduto();
		imageUrlProduto = projection.getImageUrlProduto();
	}

	public Long getId() {
		return id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public String getUnidadeMedidaProduto() {
		return unidadeMedidaProduto;
	}

	public String getImageUrlProduto() {
		return imageUrlProduto;
	}
	
	
	
	
}
