package me.dio.sacola.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Embedded;
import javax.persistence.CascadeType;

import java.util.List;

@AllArgsConstructor  // cria todos os construtores automaticamente
@Builder  // traz um design pattern SacolaBuilder
@Data  // constrói todos os getters e setters dos atributos automaticamente
@Entity  // especifica que a classe é uma entidade no banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor  // cria um construtor sem nenhum argumento (por exigência do hibernate)
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> cardapio;
    @Embedded
    private Endereco endereco;
}
