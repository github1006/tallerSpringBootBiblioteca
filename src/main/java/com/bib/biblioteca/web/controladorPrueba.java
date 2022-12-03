package com.bib.biblioteca.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controladorPrueba {
    @GetMapping("/prueba")
    public ResponseEntity<String> prueba(){
        return new ResponseEntity<String>("Hola mami", HttpStatus.OK);
    }
}
