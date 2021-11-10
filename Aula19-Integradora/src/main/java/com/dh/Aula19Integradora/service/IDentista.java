package com.dh.Aula19Integradora.service;

import com.dh.Aula19Integradora.domain.Dentista;

import java.util.List;

public interface IDentista {

    //criar metodos descritos no exercicio

    List<Dentista> listaDentista(); // chamar lista de Dentistas

    Dentista dentistaPorId(Integer id); // chamar lista pelo Id
}
