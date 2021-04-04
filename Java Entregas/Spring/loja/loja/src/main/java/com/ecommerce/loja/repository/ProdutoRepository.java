package com.ecommerce.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecommerce.loja.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByTituloProdutoContainingIgnoreCase(String tituloProduto);
	
	@Query(value = "SELECT * FROM tb_produto WHERE valor = valor", nativeQuery = true)
	public List<Produto> findAllByValor(@Param("valor") Float valor);
}
