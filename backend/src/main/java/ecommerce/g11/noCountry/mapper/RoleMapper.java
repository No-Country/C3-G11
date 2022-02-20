package ecommerce.g11.noCountry.mapper;

import ecommerce.g11.noCountry.dto.RoleDTO;
import ecommerce.g11.noCountry.dto.UserDTO;
import ecommerce.g11.noCountry.entidades.Role;
import ecommerce.g11.noCountry.entidades.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoleMapper {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Role dtoRole2EntityRole(RoleDTO dto, boolean loadUsers){
        Role role = new Role();
        role.setName(dto.getName());
        //if (loadUsers){
        //    List<User> users = this.userMapper.userDtoList2UserEntityList(dto.getUsers(), false);
        //    role.setUsers(users);
        //}
        return role;
    }

    public RoleDTO entityRole2DtoRole(Role role, boolean loadUsers){
        RoleDTO dto = new RoleDTO();
        dto.setName(role.getName());
        dto.setId(role.getId());
        //if (loadUsers){
        //    List<UserDTO> userDTOList = userMapper.userEntityList2UserDtoList(role.getUsers(), false);
        //    dto.setUsers(userDTOList);
        //}
        return dto;
    }

    public List<Role> roleDtoList2RoleEntityList(List<RoleDTO> dtos, boolean loadUsers){
        List<Role> roles = new ArrayList<>();
        for (RoleDTO dto: dtos) {
            roles.add(this.dtoRole2EntityRole(dto, loadUsers));
        }
        return roles;
    }

    public List<RoleDTO> roleEntityList2DtoRoleList(List<Role> roles, boolean loadUsers) {
        List<RoleDTO> dtos = new ArrayList<>();
        for (Role role: roles){
            dtos.add(this.entityRole2DtoRole(role, loadUsers));
        }
        return dtos;
    }
}
