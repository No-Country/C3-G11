package ecommerce.g11.noCountry.servicios;

import ecommerce.g11.noCountry.entidades.Role;
import ecommerce.g11.noCountry.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Transactional
    public Role save(Role role){

        roleRepository.save(role);

        return role;

    }

    @Transactional
    public List<Role> getAll(){
        return roleRepository.findAll();
    }

}
