package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class RoomsType {
    @Id
    private String Rtype;
    private String price;

    public String getRtype() {
        return Rtype;
    }

    public void setRtype(String rtype) {
        Rtype = rtype;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "RoomsType{" +
                "Rtype='" + Rtype + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public RoomsType(String rtype, String price) {
        Rtype = rtype;
        this.price = price;
    }

    public RoomsType() {
    }



}
