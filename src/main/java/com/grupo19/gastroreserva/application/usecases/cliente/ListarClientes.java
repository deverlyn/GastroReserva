package com.grupo19.gastroreserva.application.usecases.cliente;

import com.grupo19.gastroreserva.application.gateways.cliente.ListarClientesInterface;
import com.grupo19.gastroreserva.domain.entities.cliente.Cliente;
import com.grupo19.gastroreserva.infra.gateways.cliente.RepositorioDeClienteJpa;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarClientes {

    private final RepositorioDeClienteJpa repositorioDeClienteJpa;

    public ListarClientes(RepositorioDeClienteJpa repositorioDeClienteJpa) {
        this.repositorioDeClienteJpa = repositorioDeClienteJpa;
    }

    public List<Cliente> listarCliente(){
        return repositorioDeClienteJpa.listarClientes();
    }
}
