package com.grupo19.GastroReserva.domain.entities.cliente;

import com.grupo19.GastroReserva.domain.entities.restaurante.Restaurante;

import java.util.List;

public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private List<Restaurante> restaurantes;

    public Cliente(String cpf, String nome, String email) {

        if(cpf == null || cpf.isBlank() || nome == null || nome.isBlank() || email == null || email.isBlank()){
            throw new IllegalArgumentException("Campo Obrigatório está nulo ou vazio");
        }

        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public Cliente() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf() {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void addRestaurante(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
    }


}
