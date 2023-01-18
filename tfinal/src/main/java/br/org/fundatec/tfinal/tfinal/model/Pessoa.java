package br.org.fundatec.tfinal.tfinal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pessoa {
    @Id
    private Long id;

    @Column
    private String nome;

    @Column
    private LocalDate dataNascimento;

    @OneToOne
    private Endereco endereco;

    public long getDataNascimento(LocalDate dataNascimento) {
        if (this.dataNascimento == null) {
            return 0;
        }
        LocalDate now = LocalDate.now();
        long idade = ChronoUnit.YEARS.between(this.dataNascimento, now);
        return idade;
    }
}
