package br.com.empresa.agendamed.repository;

import br.com.empresa.agendamed.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}


