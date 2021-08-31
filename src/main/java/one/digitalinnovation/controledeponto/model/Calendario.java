package one.digitalinnovation.controledeponto.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
public class Calendario {

    @Id
    private Long id;

    private String descricao;

    private LocalDateTime dataEspecial;

    @ManyToOne
    private TipoData tipoData;
}
