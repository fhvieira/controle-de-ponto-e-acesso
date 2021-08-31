package one.digitalinnovation.controledeponto.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Builder
@Entity
public class Localidade {

    @Id
    private Long id;

    private String descricao;

    @ManyToOne
    private NivelAcesso nivelAcesso;
}
