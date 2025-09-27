package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.domain.entities.usuario.Usuario;

import java.util.List;

public interface ListarUsuarios {

    List<Usuario> obterTodosUsuarios();
}
