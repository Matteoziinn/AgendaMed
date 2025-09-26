package br.com.empresa.agendamed.repository;

import br.com.empresa.agendamed.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
