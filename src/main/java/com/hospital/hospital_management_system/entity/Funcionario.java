package com.hospital.hospital_management_system.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Funcionario extends Pessoa{
    private String Cargos;

    public Funcionario(int id, String cpf, String DataDeNascimento, String nome, String Cargos) {
        super(id, cpf, DataDeNascimento, nome);
        this.Cargos = Cargos;
    }
}
