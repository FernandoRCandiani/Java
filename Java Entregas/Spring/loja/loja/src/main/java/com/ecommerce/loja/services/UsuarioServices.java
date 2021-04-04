package com.ecommerce.loja.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.loja.model.Usuario;
import com.ecommerce.loja.repository.UsuarioRepository;

@Service
public class UsuarioServices {

	@Autowired
	private UsuarioRepository repositoryUsuario;
	
	public Optional<Usuario> cadastrarUsuario(Usuario novoUsuario){
		
		Optional<Usuario> usuarioExistente = repositoryUsuario.findByUsuario(novoUsuario.getUsuario());
		if(usuarioExistente.isPresent()) {
			return Optional.empty();
		}
		
		Optional<Usuario> usuarioCadastrado = Optional.ofNullable(repositoryUsuario.save(novoUsuario));
		if (usuarioCadastrado.isPresent()) {
			return usuarioCadastrado;
		}else {
			return Optional.empty();
		}
	}
}
