package com.ecommerce.loja.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@NotNull
	@Size(max = 45, message = "Digite seu nome por favor")
	private String nome;
	
	@NotNull
	@Size(max = 45, message = "Digite seu usuario por favor")
	private String usuario;
	
	@NotNull
	@Size(min = 8, message = "Digite sua senha por favor")
	private String senha;

	@OneToMany(mappedBy = "produtoDoUsuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"produtoDaLoja","idProduto","produtoDoUsuario"})
	private Set<Produto> produto;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"idLoja","usuario"})
	private Set<Loja> loja;
	
	@ManyToMany(cascade = CascadeType.ALL) 
	@JoinTable(
			name = "Inscricao",
			joinColumns = @JoinColumn(name = "usuarioId"),
			inverseJoinColumns = @JoinColumn(name = "lojaId"))
	@JsonIgnoreProperties("lojas")
	private List<Loja> lojas = new ArrayList<>();
	
	
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Set<Produto> getProduto() {
		return produto;
	}

	public void setProduto(Set<Produto> produto) {
		this.produto = produto;
	}

	public Set<Loja> getLoja() {
		return loja;
	}

	public void setLoja(Set<Loja> loja) {
		this.loja = loja;
	}

	public List<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(List<Loja> lojas) {
		this.lojas = lojas;
	}

}
