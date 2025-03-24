package com.biblioteca.Biblioteca.banco;

import com.biblioteca.Biblioteca.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class BancoDeLivros {
    private List<Livro> livros;

    public BancoDeLivros() {
        this.livros = new ArrayList<>();
    }
    public void insert(Livro l) {
        livros.add(l);
    }

    public Livro findOne(int id) {
        for (Livro l : livros) {
            if (l.getId() == id) {
                return l;
            }
        } return null;
    }


    public List<Livro> findAll() {
        return new ArrayList<>(livros);
    }


    public boolean update(Livro l) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId() == l.getId()) {
                livros.set(i, l);
                return true;
            }
        } return false;
    }

    public boolean delete(int id) {
        return livros.removeIf(l -> l.getId() == id);
    }

}