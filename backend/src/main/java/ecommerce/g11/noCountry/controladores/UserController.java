/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.g11.noCountry.controladores;

import ecommerce.g11.noCountry.enums.Roles;
import ecommerce.g11.noCountry.errores.ErrorService;
import ecommerce.g11.noCountry.servicios.UserService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author usuario
 */
@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService uS;
    
    @GetMapping("/register")
    public String registrar(){
        return "";  // html con el formulario de registo
    }
    
    @PostMapping("/register")
    public String registrando(ModelMap modelo, @RequestParam String name, @RequestParam String lastN, @RequestParam String mail, @RequestParam Roles rol, @RequestParam String pass, @RequestParam String pass2, @RequestParam int phone, @RequestParam String adress, @RequestParam int dni){
        try {
            uS.create(name, lastN, mail, rol, pass, pass2, phone, adress, dni);
        } catch (ErrorService ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            modelo.addAttribute("error", ex.getMessage());
            return "";  // html con el formulario de registro
        }
        return "";
    }
}
