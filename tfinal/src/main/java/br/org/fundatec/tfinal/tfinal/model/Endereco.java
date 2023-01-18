package br.org.fundatec.tfinal.tfinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoLogradouro tipoLogradouro;

    private String nomeLogradouro;

    private Integer numero;

    private String complemento;

    private String cep;

    private String cidade;

    private UnidadeFederativa uf;

}
