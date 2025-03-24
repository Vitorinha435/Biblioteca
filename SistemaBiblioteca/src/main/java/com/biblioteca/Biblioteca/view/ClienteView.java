package com.biblioteca.Biblioteca.view;

import com.biblioteca.Biblioteca.controller.ClienteController;
import com.biblioteca.Biblioteca.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ClienteView {
ClienteController cc = new ClienteController();


@GetMapping("/cliente")
public List<Cliente> getAllClientes() {
    return cc.pegarTodosOsClientes();
}


@PostMapping("/cliente")
public String postNovoCliente(@RequestBody Cliente c) {
    cc.inserirNoBanco(c);
    return "Cliente adicionado com sucesso!";
}

@PutMapping("/cliente/{id}")
public String putAtualizarCliente(@PathVariable int id, @RequestBody Cliente clienteAtualizado) {
    Cliente clienteExistente = cc.pegarClientePorId(id);
    if (clienteExistente == null) {
        return "Cliente com ID " + id + " não encontrado.";
    }

    clienteAtualizado.setIdCliente(id);
    boolean sucesso = cc.atualizarCliente(clienteAtualizado);
    if (sucesso) {
        return "Cliente atualizado com sucesso!";
    } else {
        return "Falha ao atualizar o cliente.";
    }
}

@DeleteMapping("/cliente/{id}")
public String deleteCliente(@PathVariable int id) {
    boolean sucesso = cc.deletarCliente(id);
    if (sucesso) {
        return "Cliente com ID " + id + " deletado com sucesso!";
    } else {
        return "Cliente com ID " + id + " não encontrado.";
    }
}
}