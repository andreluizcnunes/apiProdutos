package br.apiprodutos.dto;

import org.springframework.beans.BeanUtils;

import br.apiprodutos.entities.Produto;

public class ProdutoDTO {
	
	private Long id;
	private String nomeProduto;
	private double valorProduto;
	private String statusProduto;
	private String unidadeMedidaProduto;
	private String imageUrlProduto;
	private String videoUrlProduto;
	
	public ProdutoDTO() {
	}

	public ProdutoDTO(Produto produto) {
		// facilitador para atribuir dados de uma entidade para outra
		BeanUtils.copyProperties(produto, this);
	}
	
	// normalmente DTO tem somente Getter, 
	// mas como estou utilizando o BeanUtils.copyProperties
	// eu preciso gerar Getter e Setter
		

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getStatusProduto() {
		return statusProduto;
	}

	public void setStatusProduto(String statusProduto) {
		this.statusProduto = statusProduto;
	}

	public String getUnidadeMedidaProduto() {
		return unidadeMedidaProduto;
	}

	public void setUnidadeMedidaProduto(String unidadeMedidaProduto) {
		this.unidadeMedidaProduto = unidadeMedidaProduto;
	}

	public String getImageUrlProduto() {
		return imageUrlProduto;
	}

	public void setImageUrlProduto(String imageUrlProduto) {
		this.imageUrlProduto = imageUrlProduto;
	}

	public String getVideoUrlProduto() {
		return videoUrlProduto;
	}

	public void setVideoUrlProduto(String videoUrlProduto) {
		this.videoUrlProduto = videoUrlProduto;
	}
	
	
	
	
	
}
