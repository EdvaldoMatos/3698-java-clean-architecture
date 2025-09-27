package br.com.alura.codechella.application.usecases.impl;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

import java.util.List;

public class CriarUsuarioImpl implements CriarUsuario {

    private final RepositorioDeUsuario repositorio;

    public CriarUsuarioImpl(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.cadastrarUsuario(usuario);
    }

}
