package me.dio.sacola.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;


@AllArgsConstructor
@Builder
@Data
@Embeddable  // essa classe não será uma tabela no BD, mas como essa classe será usada em duas tabelas simultaneamente, facilita a reusabilidade
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String complemento;
}
