package ecommerce.g11.noCountry.repository;

import ecommerce.g11.noCountry.entidades.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}
