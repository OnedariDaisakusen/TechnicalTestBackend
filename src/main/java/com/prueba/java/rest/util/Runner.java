package com.prueba.java.rest.util;

import com.prueba.java.rest.entity.User;
import com.prueba.java.rest.repositoy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        List<User> usuarios = new ArrayList<>();

        User u1 = new User();
        u1.setNameUser("Pablo");
        u1.setUsername("pablo123");
        u1.setPassword(passwordEncoder.encode("123456"));
        User u2= new User();
        u2.setNameUser("Andrea");
        u2.setUsername("andrea123");
        u2.setPassword(passwordEncoder.encode("123456"));
        User u3= new User();
        u3.setNameUser("Juan");
        u3.setUsername("juan123");
        u3.setPassword(passwordEncoder.encode("123456"));

        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);

        userRepository.saveAll(usuarios);
    }
}
