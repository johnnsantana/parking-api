package com.johnnsantana.parking_api.service;

import com.johnnsantana.parking_api.entity.user.User;
import com.johnnsantana.parking_api.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public User findById(Long id) {
       return userRepository.findById(id).orElseThrow(
           () -> new RuntimeException("Usuário não encontrado.")
       );
    }

}
