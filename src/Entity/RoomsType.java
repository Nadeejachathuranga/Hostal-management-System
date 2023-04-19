package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class RoomsType {
    @Id

    private String type;
    private String price;

    public RoomsType(String type) {
        this.type=type;
    }

    @Override
    public String toString() {
        return "RoomTypeDto{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public RoomsType() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public RoomsType(String type, String price) {
        this.type = type;
        this.price = price;
    }
}
