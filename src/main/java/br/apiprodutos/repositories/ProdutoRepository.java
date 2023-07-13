package br.apiprodutos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.apiprodutos.entities.Produto;
import br.apiprodutos.projections.ProdutoMinProjection;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	@Query(nativeQuery = true, value = """
			SELECT tb_produto.id, tb_produto.nome_produto As nomeProduto, tb_produto.valor_produto As valorProduto, tb_produto.image_url_produto As imageUrlProduto,
			tb_produto.video_url_produto As videoUrlProduto, tb_produto.unidade_medida_produto As unidadeMedidaProduto, tb_produto.status_produto As statusProduto
			FROM tb_produto
			INNER JOIN tb_belonging ON tb_produto.id = tb_belonging.produto_id
			WHERE tb_belonging.categoria_id = :categoriaId
			ORDER BY tb_belonging.position
					""")
	List<ProdutoMinProjection> searchByList(Long categoriaId);
}
