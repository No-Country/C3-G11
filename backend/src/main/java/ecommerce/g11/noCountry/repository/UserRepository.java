package ecommerce.g11.noCountry.repository;

import ecommerce.g11.noCountry.entidades.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    public User findByUsername(String username);

}
