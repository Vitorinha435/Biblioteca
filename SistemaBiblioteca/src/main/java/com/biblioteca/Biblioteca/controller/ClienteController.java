package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.banco.BancoCliente;
import com.biblioteca.Biblioteca.model.Cliente;

import java.util.List;

public class ClienteController {
    BancoCliente bc = new BancoCliente();

    public void inserirNoBanco(Cliente c) {
        bc.insert(c);
    }

    public List<Cliente> pegarTodosOsClientes() {
        return bc.findAll();
    }

    public Cliente pegarClientePorId(int id) {
        return bc.findOne(id);
    }

    public boolean atualizarCliente(Cliente c) {
        return bc.update(c);
    }

    public boolean deletarCliente(int id) {
        return bc.delete(id);
    }

}

