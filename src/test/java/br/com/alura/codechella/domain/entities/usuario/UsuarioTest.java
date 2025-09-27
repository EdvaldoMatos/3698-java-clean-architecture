package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123456.789-99", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com"));

        assertThrows(IllegalArgumentException.class,
                () -> new Usuario("12345678999", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com"));

        assertThrows(IllegalArgumentException.class,
                () -> new Usuario("", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com"));

    }

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario() {
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("Emily", "654.123.897-88",
                LocalDate.parse("2000-10-01"));


        assertEquals("Emily", usuario.getNome());

        usuario = fabrica.incluiEndereco("12345-999", 40, "apto 201");

        assertEquals("apto 201", usuario.getEndereco().getComplemento());

    }
}