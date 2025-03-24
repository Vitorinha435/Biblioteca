package com.biblioteca.Biblioteca.model;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

public class Emprestimo {
    private Long id;
    private ZonedDateTime data_inicio;
    private ZonedDateTime data_fim;
    private List<Livro> livros_emprestados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(ZonedDateTime data_inicio) {
        this.data_inicio = data_inicio;
    }

    public ZonedDateTime getData_fim() {
        return data_fim;
    }

    public void setData_fim(ZonedDateTime data_fim) {
        this.data_fim = data_fim;
    }

    public List<Livro> getLivros_emprestados() {
        return livros_emprestados;
    }

    public void setLivros_emprestados(List<Livro> livros_emprestados) {
        this.livros_emprestados = livros_emprestados;
    }

    public void adicionarLivro(Livro l) {
    }

    public void setCliente(Cliente novoCliente) {
    }

    public void setDataFim(LocalDate novaDataFim) {
    }


}

