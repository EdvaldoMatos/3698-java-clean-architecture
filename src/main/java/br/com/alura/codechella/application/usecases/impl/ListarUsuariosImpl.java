package br.com.alura.codechella.application.usecases.impl;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.application.usecases.ListarUsuarios;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

import java.util.List;

public class ListarUsuariosImpl implements ListarUsuarios {

    private final RepositorioDeUsuario repositorio;

    public ListarUsuariosImpl(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Usuario> obterTodosUsuarios() {
        return repositorio.listarTodos();
    }
}
