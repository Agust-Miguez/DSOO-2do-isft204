
package modelo.entidades;


public class room{
    
    private int id;
    private int single_Bed;
    private int double_Bed;
    private int price_For_Day;

    public room() {
    }

    public room(int id, int single_Bed, int double_Bed, int price_For_Day) {
        this.id = id;
        this.single_Bed = single_Bed;
        this.double_Bed = double_Bed;
        this.price_For_Day = price_For_Day;
    }

  
    public int getPrice_For_Day() {
        return price_For_Day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSingle_Bed() {
        return single_Bed;
    }

    public void setSingle_Bed(int single_Bed) {
        this.single_Bed = single_Bed;
    }

    public int getDouble_Bed() {
        return double_Bed;
    }

    public void setDouble_Bed(int double_Bed) {
        this.double_Bed = double_Bed;
    }


    public void setPrice_For_Day(int price_For_Day) {
        this.price_For_Day = price_For_Day;
    }
 
@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("room{");
        sb.append("id=").append(id);
        sb.append(", single_Bed=").append(single_Bed);
        sb.append(", double_Bed=").append(double_Bed);
        sb.append(", price_For_Day=").append(price_For_Day);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
        hash = 83 * hash + this.single_Bed;
        hash = 83 * hash + this.double_Bed;
        hash = 83 * hash + this.price_For_Day;
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
        final room other = (room) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.single_Bed != other.single_Bed) {
            return false;
        }
        if (this.double_Bed != other.double_Bed) {
            return false;
        }
        return this.price_For_Day == other.price_For_Day;
    }
    
    
    
}
