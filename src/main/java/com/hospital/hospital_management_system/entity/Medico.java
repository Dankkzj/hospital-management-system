package com.hospital.hospital_management_system.entity;

public class Medico extends Funcionario {
    private String crm;
    private String especialidade;

    public Medico(int id, String cpf, String DataDeNascimento, String nome, String Cargos, String Especialidade) {
        super(id, cpf, dataDeNascimento, nome, cargos);
        this.crm = crm;
        this.especialidade = especialidade;
    }

}

