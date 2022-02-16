/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.g11.noCountry.entidades;

import ecommerce.g11.noCountry.enums.PaymentMethod;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author usuario
 */
@Entity
public class Pay implements Serializable{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private Long cardNumber;
    private Integer securityCode;
    private Long dni;
    private Date expiration;
    private String owner;
    private PaymentMethod paymentMethod;
    private Integer discount;
    private Cart cart;
    private Shipping shipping;
    private Double amount;
    //Relation
    
}
