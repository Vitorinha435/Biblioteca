package com.biblioteca.Biblioteca.banco;

import com.biblioteca.Biblioteca.model.Emprestimo;
import com.biblioteca.Biblioteca.model.Livro;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class BancoEmprestimo {
    private List<Emprestimo> emprestimos;

    public BancoEmprestimo() {
        this.emprestimos = new ArrayList<>();
    }


    public void insert(Emprestimo e) {
        emprestimos.add(e);
    }

    public Emprestimo findOne(int id) {
        for (Emprestimo e : emprestimos) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public List<Emprestimo> findAll() {
        return new ArrayList<>(emprestimos);
    }


    public boolean update(Emprestimo e) {
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getId() == e.getId()) {
                emprestimos.set(i, e);
                return true;
            }
        }
        return false;
    }


    public boolean delete(int id) {
        return emprestimos.removeIf(e -> e.getId() == id);
    }


    public List<Emprestimo> findByDataFim(ZonedDateTime dataFim) {
        List<Emprestimo> resultado = new ArrayList<>();
        for (Emprestimo e : emprestimos) {
            if (e.getData_fim().equals(dataFim)) {
                resultado.add(e);
            }
        }
        return resultado;
    }


    public boolean adicionarLivro(int idEmprestimo, Livro l) {
        Emprestimo emprestimo = findOne(idEmprestimo);
        if (emprestimo != null) {
            emprestimo.adicionarLivro(l);
            return true;
        }
        return false;
    }
}

