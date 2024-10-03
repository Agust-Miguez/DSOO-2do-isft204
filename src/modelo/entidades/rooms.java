
package modelo.entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table (name = "Habitaciones")
@NamedQuery (name = "room.findAll", query = "SELECT r FROM room r")
@NamedQuery (name = "room.find", query = "SELECT r.id FROM room WHERE r.id == id")
@NamedQuery (name = "room.findAll", query = "DETELE FROM room where r")

public class rooms implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="Habitaciones ID")
    private Long id;
    @Column (name="Camas Simples")
    private int single_Bed;
    @Column (name="Camas Dobles")
    private int double_Bed;
    @Column (name="Precio por dia")
    private int price_For_Day;
    
    public rooms ( long id, int single_Bed, int double_Bed, int price_For_Day) {
        this.id= id;
        this.single_Bed = single_Bed;
        this.double_Bed = double_Bed;
        this.price_For_Day = price_For_Day;
    }

    public rooms() {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + this.single_Bed;
        hash = 79 * hash + this.double_Bed;
        hash = 79 * hash + this.price_For_Day;
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
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Room {" + "id=" + id + ", single_Bed=" + single_Bed + ", double_Bed=" + double_Bed + ", price_For_Day=" + price_For_Day + '}';
    }
    
    
   

   
    
}
