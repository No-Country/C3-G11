package ecommerce.g11.noCountry.servicios;

import ecommerce.g11.noCountry.dto.RoleDTO;
import ecommerce.g11.noCountry.entidades.Role;
import ecommerce.g11.noCountry.mapper.RoleMapper;
import ecommerce.g11.noCountry.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RoleMapper roleMapper;

    @Transactional
    public RoleDTO save(RoleDTO roleDTO) {
        Role roleEntity = roleMapper.dtoRole2EntityRole(roleDTO, false);
        Role roleSaved = roleRepository.save(roleEntity);
        RoleDTO result = roleMapper.entityRole2DtoRole(roleSaved, false);
        return result;
    }

    @Transactional
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Transactional
    public Role getByName(String rolName){
            Role rol = roleRepository.findByName(rolName);
        return rol;
    }

}
