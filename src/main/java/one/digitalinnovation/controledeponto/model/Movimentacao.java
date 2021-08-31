package one.digitalinnovation.controledeponto.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@Entity
public class Movimentacao {

    @Data
    @Embeddable
    public class MovimentacaoId implements Serializable {
        private Long idMovimento;
        private Long idUsuario;
    };

    @EmbeddedId
    private MovimentacaoId id;

    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private BigDecimal periodo;
//    private Ocorrencia ocorrencia;
//    private Calendario calendario;
}
