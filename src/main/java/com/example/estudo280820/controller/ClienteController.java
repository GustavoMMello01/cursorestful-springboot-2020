package com.example.estudo280820.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica pra o frame work que eh uma classe controladora -> spring faz o new, ou seja, cria o objeto
public class ClienteController {
    
    @GetMapping("/cliente")
    public String getClientes(){
        return"Vai retornar todos clientes";
    }

    @GetMapping("/cliente/{codigo}")
    public String getCliente(@PathVariable int codigo){
        int x = 9;
        return x +"Retorna um cliente" + codigo;
    }

    @GetMapping("/aluno")
    public String getAlunos(){
        return"Vai retornar todos alunos";
    }
}