package com.ecommerce.loja.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	
	@NotNull
	@Size(min = 5, max = 45,message = "Adicione um titulo ao produto")
	private String tituloProduto;
	
	@NotNull
	private Float valor;
	
	private String urlImagem;
	
	@ManyToOne
	@JoinColumn(name = "fk_idProdutoDaLoja")
	@JsonIgnoreProperties("produtoCadastrado")
	private Loja produtoDaLoja;
	
	@ManyToOne
	@JoinColumn(name = "fk_idProdutoDoUsuario")
	@JsonIgnoreProperties({"lojas","loja","idUsuario","senha","produto"})
	private Usuario produtoDoUsuario;

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getTituloProduto() {
		return tituloProduto;
	}

	public void setTituloProduto(String tituloProduto) {
		this.tituloProduto = tituloProduto;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public Usuario getProdutoDoUsuario() {
		return produtoDoUsuario;
	}

	public void setProdutoDoUsuario(Usuario produtoDoUsuario) {
		this.produtoDoUsuario = produtoDoUsuario;
	}

	public Loja getProdutoDaLoja() {
		return produtoDaLoja;
	}

	public void setProdutoDaLoja(Loja produtoDaLoja) {
		this.produtoDaLoja = produtoDaLoja;
	}

}
