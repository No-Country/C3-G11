/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.g11.noCountry.repositorios;

import ecommerce.g11.noCountry.entidades.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author usuario
 */
@Repository
public interface UserRepository extends JpaRepository<User, String>{
    
    @Query("Select u from User u where u.mail =: mail")
    public Optional<User> findByMail(String mail);
    
    @Query("select count(u) from User u where u.mail =: mail")
    public int countByMail(String mail);
    
}
