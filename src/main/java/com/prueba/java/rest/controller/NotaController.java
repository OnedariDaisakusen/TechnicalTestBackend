package com.prueba.java.rest.controller;

import com.prueba.java.rest.dto.NotaDTO;
import com.prueba.java.rest.entity.NotaRegistration;
import com.prueba.java.rest.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/notas")
public class NotaController {

    @Autowired
    NotaService notaService;

    @PostMapping
    public ResponseEntity<?> saveNota(@Valid @RequestBody NotaDTO notaDTO){
        NotaRegistration resp = notaService.saveNota(notaDTO);
        return new ResponseEntity<>(resp, HttpStatus.CREATED);
    }

    @GetMapping("/getNotasByUsuario/{userId}")
    public ResponseEntity<?> getNotasByUsuario(@PathVariable Integer userId){
        List<NotaRegistration> resp = notaService.getNotesByUser(userId);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }
}
