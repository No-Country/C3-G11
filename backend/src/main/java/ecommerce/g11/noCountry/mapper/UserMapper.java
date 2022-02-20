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
public class UserMapper {

    private RoleMapper roleMapper;

    public void setRoleMapper(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    public User userDto2UserEntity(UserDTO dto, boolean loadRoles) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        if (loadRoles) {
            List<Role> roles = roleMapper.roleDtoList2RoleEntityList(dto.getRoles(), false);
            user.setRoles(roles);
        }
        return user;
    }

    public UserDTO userEntity2UserDto(User user, boolean loadRoles) {
        UserDTO dto = new UserDTO();
        dto.setUsername(user.getUsername());
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setPassword(user.getPassword());
        if (loadRoles) {
            List<RoleDTO> roleDTOList = this.roleMapper.roleEntityList2DtoRoleList(user.getRoles(), false);
            dto.setRoles(roleDTOList);
        }
        return dto;
    }

    public List<User> userDtoList2UserEntityList(List<UserDTO> users, boolean loadRoles) {
        List<User> entities = new ArrayList<>();
        for (UserDTO user : users) {
            entities.add(this.userDto2UserEntity(user, loadRoles));
        }
        return entities;
    }

    public List<UserDTO> userEntityList2UserDtoList(List<User> users, boolean loadRoles) {
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user : users) {
            userDTOList.add(this.userEntity2UserDto(user,false));
        }
        return userDTOList;
    }
}
