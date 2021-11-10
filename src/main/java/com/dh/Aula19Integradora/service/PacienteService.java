package com.dh.Aula19Integradora.service;

import com.dh.Aula19Integradora.domain.Dentista;
import com.dh.Aula19Integradora.domain.Endereco;
import com.dh.Aula19Integradora.domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PacienteService implements IPaciente{

// puxar os Metodos de IPaicente, pq tem o implement
    @Override
    public List<Paciente> listaPaciente() {
        List<Paciente> lista = new ArrayList<>();

        // adicionou 3 pacientes a nossa lista
        lista.add(new Paciente(8169, "Maria", "Silva", "maria@gmail.com", "555555",
                new Date(), new Endereco("Rua Morais", "100", "Sao Paulo", "SP"),
                new Dentista(10, "Paulo", "Ross", "1010")));
        lista.add(new Paciente(3355, "Jose", "Gomes", "jose@gmail.com", "666666",
                new Date(), new Endereco("Rua Arara", "120", "Osasco", "SP"),
                new Dentista(11, "Paula", "Rossa", "1111")));
        lista.add(new Paciente(5556, "Jessica", "Loca", "jessica@gmail.com", "777777",
                new Date(), new Endereco("Rua Edson", "300", "Barueri", "SP"),
                new Dentista(12, "Paul", "Russo", "1212")));

        return lista;
    }

    @Override
    public Paciente pacientePorEmail(String email) {

        // chamar pelo email + new Date chama a data atual + new Endereco para buscar a classe endereco
        return new Paciente(2548, "Felipe", "Reusch", email , "444444", new Date(),
                new Endereco("Rainha", "30", "Rio de Janeiro","RJ" ),
                new Dentista(12, "Paul", "Russo", "1212"));


    }
}
