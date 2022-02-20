package ecommerce.g11.noCountry.dto;

import ecommerce.g11.noCountry.entidades.Role;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
public class UserDTO {

    private String id;

    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private List<RoleDTO> roles;

}
