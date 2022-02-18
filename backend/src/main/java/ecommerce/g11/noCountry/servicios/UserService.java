/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.g11.noCountry.servicios;

import ecommerce.g11.noCountry.entidades.User;
import ecommerce.g11.noCountry.enums.Roles;
import ecommerce.g11.noCountry.errores.ErrorService;
import ecommerce.g11.noCountry.repositorios.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class UserService {
    @Autowired
    private UserRepository uR;
    
    public User create (String name, String lastN, String mail, Roles rol, String pass, String pass2, int phone, String adress, int dni)throws ErrorService{
        checkDatesCreate(name, lastN, mail, rol, pass, pass2, phone, adress, dni);
        User user = new User();
//        user.setName(name);
//        user.SetLastName(lastN);
//        user.SetMail(mail);
//        user.SetRol(rol);
//        user.SetPassword(pass);
//        user.SetPhoneNumber(phone);
//        user.SetAdress(adress);
//        user.SetDni(dni);
        return uR.save(user);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////// VERIFICATIONS /////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    private void checkDatesCreate (String name, String lastN, String mail, Roles rol, String pass, String pass2, int phone, String adress, int dni)throws ErrorService{
        if(name == null || name.isEmpty()){
            throw new ErrorService("The name is not valid");
        }
        if(lastN == null || lastN.isEmpty()){
            throw new ErrorService("the last name entered is not valid");
        }
        if(mail == null || mail.isEmpty()){
            throw new ErrorService("the last name entered is not valid");
        }
        if(countByMail(mail) != 0){
            throw new ErrorService("an acount whit that mail is already exists");
        }
        if(rol == null){
            throw new ErrorService("you must insert your rol in the shop");
        }
        if(pass == null || pass.isEmpty()){
            throw new ErrorService("you must enter a password");
        }
        if(!pass2.equals(pass)){
            throw new ErrorService("the password aren´t equals");
        }
        String StrPhone = String.valueOf(phone);
        if(StrPhone == null || StrPhone.isEmpty()){
            throw new ErrorService("the phone number wasn´t introduced");
        }
        if(adress == null || adress.isEmpty()){
            throw new ErrorService("the adress is incorrect");
        }
        String Strdni = String.valueOf(dni);
        if(Strdni == null || Strdni.isEmpty()){
            throw new ErrorService("the DNI wasn´t introduced");
        }
    }
    
    ////////////////////////////// QUERYS //////////////////////////////////////
    
    private int countByMail(String mail)throws ErrorService{
        return uR.countByMail(mail);
    }
}
