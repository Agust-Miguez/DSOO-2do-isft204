/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *//*
package model.entitys;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "reservas")
@NamedQuery (name = "reservation_findAll", query = "SELECT r FROM reservation r")
@NamedQuery (name = "reservation_find", query = "SELECT r FROM reservation r WHERE r = :ID")
@NamedQuery (name = "reservation_delete", query = "DELETE FROM reservation r WHERE r = :ID")


public class reservation implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="Reservas_ID")
    private Long id;
    @Column (name="Fecha_de_Ingreso")
    private Date date_Checkin;
    @Column (name="Fecha_de_Salida")
    private Date date_Checkout;
   /* @Column (name="Habitaciones")
    private rooms rooms;*/
   /* @ManyToOne
    @JoinColumn (name = "pasajeros id")
    @Column (name="Pasajero")
    private passenger passenger;*/
    
    
    
