/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.entitys.*;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author feffo
 */
@Entity
@Table(name="Pasajero") 
public class passenger implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column  (name="Nombre")
    private String name;
    @Column (name="Apellido")
    private String last_Name;
    @Column (name="DNI")
    private Long dni;
    @Column (name="Telefono")
    private Long phone_Number;
    @Column (name="Email")
    private String email;

    public passenger() {
    }

    public passenger(String name, String last_Name, Long dni, Long phone_Number, String email) {
        this.name = name;
        this.last_Name = last_Name;
        this.dni = dni;
        this.phone_Number = phone_Number;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setPhone_Number(Long phone_Number) {
        this.phone_Number = phone_Number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public Long getDni() {
        return dni;
    }

    public Long getPhone_Number() {
        return phone_Number;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + Objects.hashCode(this.last_Name);
        hash = 11 * hash + Objects.hashCode(this.dni);
        hash = 11 * hash + Objects.hashCode(this.phone_Number);
        hash = 11 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final passenger other = (passenger) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.last_Name, other.last_Name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return Objects.equals(this.phone_Number, other.phone_Number);
    }

    @Override
    public String toString() {
        return "passangers{" + "id=" + id + ", name=" + name + ", last_Name=" + last_Name + ", dni=" + dni + ", phone_Number=" + phone_Number + ", email=" + email + '}';
    }
    
}
