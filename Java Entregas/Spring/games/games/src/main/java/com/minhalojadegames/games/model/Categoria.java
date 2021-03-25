package com.minhalojadegames.games.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	@NotNull
	private String categoriaDoJogo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "produto_id",referencedColumnName = "idProduto")
	private Produto batatinha;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoriaDoJogo() {
		return categoriaDoJogo;
	}

	public void setCategoriaDoJogo(String categoriaDoJogo) {
		this.categoriaDoJogo = categoriaDoJogo;
	}

	public Produto getBatatinha() {
		return batatinha;
	}

	public void setBatatinha(Produto batatinha) {
		this.batatinha = batatinha;
	}
	
	
}
