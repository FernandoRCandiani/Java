package com.minhalojadegames.games.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	
	@NotNull
	@Size(min = 1, max = 25)
	private String nomeGame;
	
	@NotNull
	@Size(min = 1, max = 20)
	private String tags;
	
	@NotNull
	@Size(min = 1, max = 20)
	private String desenvolvedor;
	
	@NotNull
	@Size(min = 1, max = 20)
	private String plataforma;
	
	@NotNull
	private double valor;
	
	@OneToOne(mappedBy = "batatinha")
	private Categoria categoria;

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeGame() {
		return nomeGame;
	}

	public void setNomeGame(String nomeGame) {
		this.nomeGame = nomeGame;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
