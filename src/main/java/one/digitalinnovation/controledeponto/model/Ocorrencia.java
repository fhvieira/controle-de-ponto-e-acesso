package one.digitalinnovation.controledeponto.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@Entity
public class Ocorrencia {

    @Id
    private Long id;

    private String nome;

    private String descricao;
}
