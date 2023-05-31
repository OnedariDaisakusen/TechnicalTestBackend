package com.prueba.java.rest.service;

import com.prueba.java.rest.dto.NotaDTO;
import com.prueba.java.rest.entity.NotaRegistration;

import java.util.List;

public interface NotaService {
    NotaRegistration saveNota(NotaDTO notaDTO);
    List<NotaRegistration> getNotesByUser(Integer userId);
}
