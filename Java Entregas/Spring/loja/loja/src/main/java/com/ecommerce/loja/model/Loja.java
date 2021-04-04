package com.ecommerce.loja.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_loja")
public class Loja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLoja;
	
	@NotNull
	@Size(max = 45, message = "Digite um nome a loja")
	private String nomeLoja;
	
	@NotNull
	@Size(min = 10, max = 100, message = "Escreva a descrição")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "fk_idUsuario")
	@JsonIgnoreProperties({"lojas","idUsuario","senha","loja"})
	private Usuario usuario;
	
	@ManyToMany(mappedBy = "lojas")
	@JsonIgnoreProperties("lojas")
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy = "produtoDaLoja", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("produtoDaLoja")
	private List<Produto> produtoCadastrado;

	public Long getIdLoja() {
		return idLoja;
	}

	public void setIdLoja(Long idLoja) {
		this.idLoja = idLoja;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Produto> getProdutoCadastrado() {
		return produtoCadastrado;
	}

	public void setProdutoCadastrado(List<Produto> produtoCadastrado) {
		this.produtoCadastrado = produtoCadastrado;
	}

}
