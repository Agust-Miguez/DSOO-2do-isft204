/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitys;

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
@Table(name="pasajeros") 
public class passenger implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column  (name="Nombre")
    private String naMe;
    @Column (name="Apellido")
    private String last_Name;
    @Column (name="DNI")
    private Long dni;
    @Column (name="Telefono")
    private Long phone_Number;
    @Column (name="Email")
    private String email;
    @Column(name="Reserva_ID")
    private long id_Reserva;

    public passenger() {
    }

    public passenger(String naMe, String last_Name1, Long Dni, Long phone, String email1) {
        this.naMe = naMe;
        this.last_Name = last_Name;
        this.dni = dni;
        this.phone_Number = phone_Number;
        this.email = email;
    }

    public passenger(Long id, String name, String last_Name, Long dni, Long phone_Number, String email) {
        this.id = id;
        this.naMe = name;
        this.last_Name = last_Name;
        this.dni = dni;
        this.phone_Number = phone_Number;
        this.email = email;
    }

    public passenger(String name, String last_Name, Long dni, Long phone_Number, String email, Long id_Reserva) {
        this.naMe = name;
        this.last_Name = last_Name;
        this.dni = dni;
        this.phone_Number = phone_Number;
        this.email = email;
    }

    public void setId_Reserva(long id_Reserva) {
        this.id_Reserva = id_Reserva;
    }

    public long getId_Reserva() {
        return id_Reserva;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.naMe = name;
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
        return naMe;
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
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.naMe);
        hash = 97 * hash + Objects.hashCode(this.last_Name);
        hash = 97 * hash + Objects.hashCode(this.dni);
        hash = 97 * hash + Objects.hashCode(this.phone_Number);
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + (int) (this.id_Reserva ^ (this.id_Reserva >>> 32));
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
        if (this.id_Reserva != other.id_Reserva) {
            return false;
        }
        if (!Objects.equals(this.naMe, other.naMe)) {
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
        return "passengers{" + "id=" + id + ", name=" + naMe + ", last_Name=" + last_Name + ", dni=" + dni + ", phone_Number=" + phone_Number + ", email=" + email + ", id_Reserva=" + id_Reserva + '}';
    }

  
    
}

