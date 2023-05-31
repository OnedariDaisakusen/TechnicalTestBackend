package com.prueba.java.rest.service;

import com.prueba.java.rest.dto.NotaDTO;
import com.prueba.java.rest.entity.Course;
import com.prueba.java.rest.entity.NotaRegistration;
import com.prueba.java.rest.entity.User;
import com.prueba.java.rest.repositoy.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotaServiceImpl implements NotaService {

    @Autowired
    NotaRepository notaRepository;

    @Override
    public NotaRegistration saveNota(NotaDTO notaDTO) {

        User user = new User();
        user.setUserId(notaDTO.getUserId());

        Course course = new Course();
        course.setCourseId(notaDTO.getCourseId());

        NotaRegistration notaRegistration = new NotaRegistration();
        notaRegistration.setUser(user);
        notaRegistration.setCourse(course);
        notaRegistration.setNota(notaDTO.getNota());

        return notaRepository.save(notaRegistration);
    }

    @Override
    public List<NotaRegistration> getNotesByUser(Integer userId) {
        User user = new User();
        user.setUserId(userId);

        List<NotaRegistration> data = notaRepository.findByUser(user);
        return data;
    }
}
