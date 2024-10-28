/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author feffo
 */
@Entity
public class reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name="Fecha_Ingreso")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_Check_In;
    @Column (name="Fecha_Salida")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_Chek_Out;
    @Column (name="Pasajero_ID")
    private Long passenger;
    @Column (name="Total")
    private int total;
    @Column (name="seña")
    private int seña;
    @Column (name="Habitaciones_ID")
    private final List <Long> list_Rooms = new ArrayList<>();
    @Column (name="Pasajero_ID")
    private Long id_Passenger;

    public reservation() {
    }

    public reservation(Date date_Check_In, Date date_Chek_Out, Long passenger, int total, int seña, Long id_Passenger) {
        this.date_Check_In = date_Check_In;
        this.date_Chek_Out = date_Chek_Out;
        this.passenger = passenger;
        this.total = total;
        this.seña = seña;
        this.id_Passenger = id_Passenger;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public Date getDate_Check_In() {
        return date_Check_In;
    }

    public Date getDate_Chek_Out() {
        return date_Chek_Out;
    }

    public Long getPassenger() {
        return passenger;
    }

    public int getTotal() {
        return total;
    }

    public int getSeña() {
        return seña;
    }

    public List<Long> getList_Rooms() {
        return list_Rooms;
    }

    public Long getId_Passenger() {
        return id_Passenger;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate_Check_In(Date date_Check_In) {
        this.date_Check_In = date_Check_In;
    }

    public void setDate_Chek_Out(Date date_Chek_Out) {
        this.date_Chek_Out = date_Chek_Out;
    }

    public void setPassenger(Long passenger) {
        this.passenger = passenger;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setSeña(int seña) {
        this.seña = seña;
    }

    public void setId_Passenger(Long id_Passenger) {
        this.id_Passenger = id_Passenger;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.date_Check_In);
        hash = 29 * hash + Objects.hashCode(this.date_Chek_Out);
        hash = 29 * hash + Objects.hashCode(this.passenger);
        hash = 29 * hash + this.total;
        hash = 29 * hash + this.seña;
        hash = 29 * hash + Objects.hashCode(this.list_Rooms);
        hash = 29 * hash + Objects.hashCode(this.id_Passenger);
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
        final reservation other = (reservation) obj;
        if (this.total != other.total) {
            return false;
        }
        if (this.seña != other.seña) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.date_Check_In, other.date_Check_In)) {
            return false;
        }
        if (!Objects.equals(this.date_Chek_Out, other.date_Chek_Out)) {
            return false;
        }
        if (!Objects.equals(this.passenger, other.passenger)) {
            return false;
        }
        if (!Objects.equals(this.list_Rooms, other.list_Rooms)) {
            return false;
        }
        return Objects.equals(this.id_Passenger, other.id_Passenger);
    }

    @Override
    public String toString() {
        return "reservation{" + "id=" + id + ", date_Check_In=" + date_Check_In + ", date_Chek_Out=" + date_Chek_Out + ", passenger=" + passenger + ", total=" + total + ", se\u00f1a=" + seña + ", list_Rooms=" + list_Rooms + ", id_Passenger=" + id_Passenger + '}';
    }
    
}
