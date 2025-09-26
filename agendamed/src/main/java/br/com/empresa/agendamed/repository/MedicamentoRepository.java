package br.com.empresa.agendamed.repository;

import br.com.empresa.agendamed.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}

