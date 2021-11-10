package com.dh.Aula19Integradora.controller;

import com.dh.Aula19Integradora.domain.Paciente;
import com.dh.Aula19Integradora.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("paciente")

public class PacienteRestController {

    @Autowired
    public PacienteService service;

    @GetMapping("listar")
    public List<Paciente> paciente(){
        return service.listaPaciente();
    }

    @GetMapping("/email/{email}")
    public Paciente pacientePorEmail(@PathVariable String email){
        return service.pacientePorEmail(email);
    }

}
