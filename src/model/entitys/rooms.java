/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
package model.entitys;

import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author feffo
 */
/* 
@Entity
@Table (name="rooms")
public class rooms implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="rooms_ID")
    
    private Long id;
    @Column (name="sigle_Bed")
    private int single_Bed;
    @Column (name="Double_Bed")
    private int double_Bed;
   @Column (name="Pirce_For_Day")
    private int price_For_Day;
    @Column (name="Reserva")
    @OneToOne
    @JoinColumn(name="Reserva_ID")
    private reservation reserve;

    public rooms(int single_Bed, int double_Bed, int price_For_Day) {
        this.single_Bed = single_Bed;
        this.double_Bed = double_Bed;
        this.price_For_Day = price_For_Day;
    }

    public rooms() {
    }

    public rooms(Long id, int single_Bed, int double_Bed, int price_For_Day, reservation reserve) {
        this.id = id;
        this.single_Bed = single_Bed;
        this.double_Bed = double_Bed;
        this.price_For_Day = price_For_Day;
        this.reserve = reserve;
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

    public reservation getReserve() {
        return reserve;
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

    public void setReserve(reservation reserve) {
        this.reserve = reserve;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + this.single_Bed;
        hash = 23 * hash + this.double_Bed;
        hash = 23 * hash + this.price_For_Day;
        hash = 23 * hash + Objects.hashCode(this.reserve);
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
        return Objects.equals(this.reserve, other.reserve);
    }

    @Override
    public String toString() {
        return "rooms{" + "id=" + id + ", single_Bed=" + single_Bed + ", double_Bed=" + double_Bed + ", price_For_Day=" + price_For_Day + ", reserve=" + reserve + '}';
    }
    

   
    */

