package com.hospital.hospital_management_system.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Terceirizados extends Funcionario{
    private String Empresa;

    public Terceirizados(int id, String cpf, String DataDeNascimento, String nome, String Cargos, String Empresa) {
        super(id, cpf, DataDeNascimento, nome, Cargos);
        this.Empresa = Empresa;
    }
}