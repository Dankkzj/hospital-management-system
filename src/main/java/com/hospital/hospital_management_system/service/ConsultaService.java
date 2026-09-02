package com.hospital.hospital_management_system.service;

import com.hospital.hospital_management_system.entity.Consulta;
import com.hospital.hospital_management_system.entity.Paciente;
import com.hospital.hospital_management_system.entity.Medico;
import com.hospital.hospital_management_system.entity.StatusConsulta;
import com.hospital.hospital_management_system.repository.ConsultaRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class ConsultaService {
    private final ConsultaRepository consultaRepository;

    public ConsultaService(ConsultaRepository consultaRepository){
        this.consultaRepository = consultaRepository;
    }
    public String ExibirStatus(String status){
        return status;
    }

    public void RemarcarConsulta(Consulta consulta, LocalDateTime DataNova){
        if(DataNova == null){
            throw new IllegalArgumentException("Data não existe");
        }
        if (DataNova.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("Erro: Não é possível remarcar para esta data");
        }
        //Data remarcada; Tenho que mexer nisso no futuro, colocar coisas como não marcar em finais de semanas, feriados
        //dá uma profundidade maior.
        consulta.setDataHora(DataNova);

        consultaRepository.save(consulta);
    }

    public void MarcarConsulta(LocalDateTime dataHora, Paciente paciente, Medico medico, long ID){
        if(dataHora == null) {
            throw new IllegalArgumentException("Data não existe");
        }
        if (dataHora.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("Erro: Não é possível remarcar para esta data");
        }

        Consulta novaConsulta = new Consulta();

        novaConsulta.setDataHora(dataHora);
        novaConsulta.setPaciente(paciente);
        novaConsulta.setMedico(medico);
        novaConsulta.setStatus(StatusConsulta.AGENDADA);

        consultaRepository.save(novaConsulta);

    }

    public void FinalizarConsulta(Consulta consulta){
        consulta.setStatus(StatusConsulta.FINALIZADA);
        consultaRepository.save(consulta);
    }

    public void CancelarConsulta(Consulta consulta){
        consulta.setStatus(StatusConsulta.CANCELADA);
        consultaRepository.save(consulta);

    }
}

