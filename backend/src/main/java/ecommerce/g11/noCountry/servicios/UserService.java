/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.g11.noCountry.servicios;

import ecommerce.g11.noCountry.entidades.User;
import ecommerce.g11.noCountry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author usuario
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {

        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userRepository.save(user);
        return user;

    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

}
