/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.g11.noCountry.enums;

/**
 *
 * @author Equipo
 */
public enum ProductCategory {
    EMPANADAS("Empanadas"), TARTAS("Tartas"), PIZZAS("Pizzas y Pizzanesas"),
    PAPAS("Papas"), VINAGRETAS("Vinagretas"), VARIOS("Varios"), 
    BEBIDAS("Bebidas"), POSTRES("Postres");

    private String value;

    private ProductCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
