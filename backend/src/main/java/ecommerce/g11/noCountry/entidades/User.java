/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.g11.noCountry.entidades;

import ecommerce.g11.noCountry.enums.Roles;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author usuario
 */
@Entity
public class User implements Serializable{
    @Id 
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String name;
    private String lastname;
    private Roles roles;
    private String password;
    private String email;
    private Long phoneNumber;
    private String Adress;
    private Long DNI;

    public User() {
    }

    public User(String id, String name, String lastname, Roles roles, String password, String email, Long phoneNumber, String Adress, Long DNI) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.roles = roles;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.Adress = Adress;
        this.DNI = DNI;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", lastname=" + lastname + ", roles=" + roles + ", password=" + password + ", email=" + email + ", phoneNumber=" + phoneNumber + ", Adress=" + Adress + ", DNI=" + DNI + '}';
    }
    
    
}
