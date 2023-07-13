package br.apiprodutos.projections;

public interface ProdutoMinProjection {
	
	Long getId(); 
	String getNomeProduto();
	double getValorProduto(); 
	String getImageUrlProduto();
	String getVideoUrlProduto();
	String getUnidadeMedidaProduto();
	String getStatusProduto();
}
