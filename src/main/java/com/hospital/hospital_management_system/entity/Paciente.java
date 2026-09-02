package com.hospital.hospital_management_system.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Paciente extends Pessoa{
    private String TipoSangue;
    private String Convenio;
    private String Historico;

    protected Paciente(int id, String cpf, String DataDeNascimento, String nome, String Historico, String Convenio, String TipoSangue) {
        super(id, cpf, DataDeNascimento, nome);
        this.Convenio = Convenio;
        this.Historico = Historico;
        this.TipoSangue = TipoSangue;
    }
}
