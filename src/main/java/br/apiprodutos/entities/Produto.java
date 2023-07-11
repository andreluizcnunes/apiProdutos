package br.apiprodutos.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeProduto;
	private double valorProduto;
	private String statusProduto;
	private String unidadeMedidaProduto;
	private String imageUrlProduto;
	private String videoUrlProduto;
	
	public Produto() {
	}

	public Produto(Long id, String nomeProduto, double valorProduto, String statusProduto, String unidadeMedidaProduto,
			String imageUrlProduto, String videoUrlProduto) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.statusProduto = statusProduto;
		this.unidadeMedidaProduto = unidadeMedidaProduto;
		this.imageUrlProduto = imageUrlProduto;
		this.videoUrlProduto = videoUrlProduto;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
