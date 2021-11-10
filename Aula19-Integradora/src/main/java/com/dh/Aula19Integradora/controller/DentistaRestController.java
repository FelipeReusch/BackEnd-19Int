package com.dh.Aula19Integradora.controller;

import com.dh.Aula19Integradora.domain.Dentista;
import com.dh.Aula19Integradora.domain.Paciente;
import com.dh.Aula19Integradora.service.DentistaService;
import com.dh.Aula19Integradora.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dentista")

public class DentistaRestController {
    @Autowired
    public DentistaService service;

    @GetMapping("lista")
    public List<Dentista> dentista(){
        return service.listaDentista();
    }

    @GetMapping("/id/{id}")
    public Dentista dentistaPorId(@PathVariable Integer id){
        return service.dentistaPorId(id);
    }

}
