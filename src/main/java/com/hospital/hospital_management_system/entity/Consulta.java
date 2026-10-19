package com.hospital.hospital_management_system.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

    
@Getter
@Setter
@NoArgsConstructor
public class Consulta {
    private Medico medico;
    private long id;
    private Paciente paciente;
    private LocalDateTime dataHora;
    private String observacoes;
    private boolean finalizar;

    @Enumerated(EnumType.STRING)
    private StatusConsulta status;


    public Consulta(Medico medico, long ID, Paciente paciente, LocalDateTime dataHora, String observacoes, StatusConsulta status){
        this.medico = medico;
        this.id = id;
        this.status = status;
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.observacoes = observacoes;
    }
}