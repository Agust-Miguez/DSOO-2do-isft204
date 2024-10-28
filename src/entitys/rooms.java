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

/**
 *
 * @author feffo
 */
@Entity
public class rooms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name="Camas_Simples")
    private int single_Bed;
    @Column(name="Camas_Dobles")
    private int double_Bed;
    @Column (name="Precio_por_dia")
    private int price_For_Day;
    @Column (name="ID_Reserva")
    private Long id_Reserva;
    @Column (name="Disponibilidad")
    private Boolean disponibilidad;

    public rooms() {
    }

    public rooms(int single_Bed, int double_Bed, int price_For_Day) {
        this.single_Bed = single_Bed;
        this.double_Bed = double_Bed;
        this.price_For_Day = price_For_Day;
    }

    public rooms(Long id, int single_Bed, int double_Bed, int price_For_Day, Long id_Reserva, Boolean disponibilidad) {
        this.id = id;
        this.single_Bed = single_Bed;
        this.double_Bed = double_Bed;
        this.price_For_Day = price_For_Day;
        this.id_Reserva = id_Reserva;
        this.disponibilidad = disponibilidad;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public int getSingle_Bed() {
        return single_Bed;
    }

    public int getDouble_Bed() {
        return double_Bed;
    }

    public int getPrice_For_Day() {
        return price_For_Day;
    }

    public Long getId_Reserva() {
        return id_Reserva;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSingle_Bed(int single_Bed) {
        this.single_Bed = single_Bed;
    }

    public void setDouble_Bed(int double_Bed) {
        this.double_Bed = double_Bed;
    }

    public void setPrice_For_Day(int price_For_Day) {
        this.price_For_Day = price_For_Day;
    }

    public void setId_Reserva(Long id_Reserva) {
        this.id_Reserva = id_Reserva;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + this.single_Bed;
        hash = 11 * hash + this.double_Bed;
        hash = 11 * hash + this.price_For_Day;
        hash = 11 * hash + Objects.hashCode(this.id_Reserva);
        hash = 11 * hash + Objects.hashCode(this.disponibilidad);
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
        final rooms other = (rooms) obj;
        if (this.single_Bed != other.single_Bed) {
            return false;
        }
        if (this.double_Bed != other.double_Bed) {
            return false;
        }
        if (this.price_For_Day != other.price_For_Day) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.id_Reserva, other.id_Reserva)) {
            return false;
        }
        return Objects.equals(this.disponibilidad, other.disponibilidad);
    }

    @Override
    public String toString() {
        return "rooms{" + "id=" + id + ", single_Bed=" + single_Bed + ", double_Bed=" + double_Bed + ", price_For_Day=" + price_For_Day + ", id_Reserva=" + id_Reserva + ", disponibilidad=" + disponibilidad + '}';
    }

    
    
}
