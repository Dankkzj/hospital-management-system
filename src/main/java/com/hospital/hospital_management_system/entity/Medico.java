package com.hospital.hospital_management_system.entity;

public class Medico extends Funcionario {
    private String Crm;
    private String Especialidade;

    public Medico(int id, String cpf, String DataDeNascimento, String nome, String Cargos, String Especialidade) {
        super(id, cpf, DataDeNascimento, nome, Cargos);
        this.Crm = Crm;
        this.Especialidade = Especialidade;
    }

}

