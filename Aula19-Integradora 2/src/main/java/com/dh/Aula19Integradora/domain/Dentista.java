package com.dh.Aula19Integradora.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dentista {

    private Integer id;
    private String nome;
    private String sobrenome;
    private String matricula;

    public Dentista(Integer id, String nome, String sobrenome, String matricula) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }
}
