package br.com.andcorp.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.andcorp.projeto.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {

	//public Usuario findByEmailAndSenha(String email, String senha);
	//public Usuario findByRacfAndSenha(String racf, String senha);
	public Usuario findByRacfOrEmail(String racf, String email);
}
