package com.leonardo.futurodev.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.futurodev.domain.service.UsuarioService;
import com.leonardo.futurodev.rest.dto.CounterDto;
import com.leonardo.futurodev.rest.dto.UsuarioDto;

@RestController

public class HelloWorldController {
    @Autowired
    UsuarioService usuarioService;

        @GetMapping("/helloworld")
        public String getHelloWorld(){
            return "Hello, world";
        }

}
