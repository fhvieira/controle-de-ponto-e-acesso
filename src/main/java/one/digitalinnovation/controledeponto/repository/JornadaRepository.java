package one.digitalinnovation.controledeponto.repository;

import one.digitalinnovation.controledeponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
