package ecommerce.g11.noCountry.dto;

import ecommerce.g11.noCountry.entidades.User;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter @Setter
public class RoleDTO {

    private String id;

    private String name;

    //private List<UserDTO> users;
}
