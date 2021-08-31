package one.digitalinnovation.controledeponto.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@Entity
public class NivelAcesso {

    @Id
    private Long id;
    private String descricao;
}
