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
public enum PaymentMethod {
    CREDIT_CARD("Tarjeta de crédito"), CASH("Efectivo"), DEBIT_CARD("Tarjeta de débito"),
    MERCADO_PAGO("MercadoPago");

    private String value;

    private PaymentMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
}
