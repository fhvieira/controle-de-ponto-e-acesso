package one.digitalinnovation.controledeponto.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
public class Usuario {

    @Id
    private Long id;

    private String nome;

    private BigDecimal tolerancia;

    private LocalDateTime inicioJornada;

    private LocalDateTime fimJornada;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private CategoriaUsuaio categoriaUsuaio;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
}
