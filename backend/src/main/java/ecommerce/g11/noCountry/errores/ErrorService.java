/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.g11.noCountry.errores;

/**
 *
 * @author usuario
 */
public class ErrorService extends Exception{
    public ErrorService (String msj) {
        super(msj);
    }
    
}
