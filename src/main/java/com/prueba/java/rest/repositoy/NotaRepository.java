package com.prueba.java.rest.repositoy;

import com.prueba.java.rest.entity.NotaRegistration;
import com.prueba.java.rest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotaRepository extends JpaRepository<NotaRegistration, Integer> {

    List<NotaRegistration> findByUser(User user);
}
