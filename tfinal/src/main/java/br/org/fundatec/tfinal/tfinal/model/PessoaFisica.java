package br.org.fundatec.tfinal.tfinal.model;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa{
    public PessoaFisica(Long id, String nome, LocalDate dataNascimento, Endereco endereco) {
        super(id, nome, dataNascimento, endereco);
    }

}
