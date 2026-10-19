package com.hospital.hospital_management_system.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Paciente extends Pessoa{
    private String tipoSangue;
    private String convenio;
    private String historico;

    protected Paciente(int id, String cpf, String DataDeNascimento, String nome, String Historico, String Convenio, String TipoSangue) {
        super(id, cpf, DataDeNascimento, nome);
        this.convenio = convenio;
        this.historico = historico;
        this.tipoSangue = tipoSangue;
    }
}
