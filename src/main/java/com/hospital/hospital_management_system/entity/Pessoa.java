package com.hospital.hospital_management_system.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Pessoa {
    private long id;
    private String cpf;
    private String dataDeNascimento;
    private String nome;

    protected Pessoa(int id, String cpf, String DataDeNascimento, String nome){
        this.id = id;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
    }

    public String getCpfMascarado() {
        if (cpf == null || cpf.length() != 11) {
            return "***.***.***-**";
        }
        return "***." + cpf.substring(4, 6) + "." + cpf.substring(7, 9) + "-**";
    }
}
