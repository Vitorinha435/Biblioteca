package com.biblioteca.Biblioteca.banco;

import com.biblioteca.Biblioteca.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class BancoCliente {
    private List<Cliente> clientes;

    public BancoCliente() {
        this.clientes = new ArrayList<>();
    }

    public void insert(Cliente c) {
        clientes.add(c);
    }

    public Cliente findOne(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    public boolean update(Cliente c) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == c.getId()) {
                clientes.set(i, c);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id) {
        return clientes.removeIf(c -> c.getId() == id);
    }
}

