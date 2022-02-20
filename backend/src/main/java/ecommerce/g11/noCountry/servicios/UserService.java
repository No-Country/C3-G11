/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.g11.noCountry.servicios;

import ecommerce.g11.noCountry.dto.UserDTO;
import ecommerce.g11.noCountry.entidades.Role;
import ecommerce.g11.noCountry.entidades.User;
import ecommerce.g11.noCountry.mapper.UserMapper;
import ecommerce.g11.noCountry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author usuario
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleService roleService;


    public User save(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        List<Role> roles = new ArrayList<>();
        for (Role role: user.getRoles()) {
            roles.add(roleService.getByName(role.getName()));
        }
        //roles.add(roleService.getByName("USER"));
        user.setRoles(roles);
        User userSaved = userRepository.save(user);
        //UserDTO result = userMapper.userEntity2UserDto(userSaved, false);
        return userSaved;

    }

    public List<User> getAll(){
        //List<UserDTO> userDTOList =new ArrayList<>();
        List<User> usersEntities = userRepository.findAll();
        return usersEntities;
    }

}
