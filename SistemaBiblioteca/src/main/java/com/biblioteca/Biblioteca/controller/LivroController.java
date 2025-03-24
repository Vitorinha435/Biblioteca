package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.banco.BancoDeLivros;
import com.biblioteca.Biblioteca.model.Livro;

import java.util.List;

public class LivroController {
    BancoDeLivros bl = new BancoDeLivros();

    public void inserirNoBanco(Livro l) {
        bl.insert(l);
    }

    public List<Livro> pegarTodosOsLivros() {
        return bl.findAll();
    }

    public boolean atualizarLivro(Livro l) {
        return bl.update(l);
    }
    public boolean deletarLivro(int id) {
        return bl.delete(id);
    }

    public Livro pegarLivroPorId(int id) {
        return bl.findOne(id);
    }
}