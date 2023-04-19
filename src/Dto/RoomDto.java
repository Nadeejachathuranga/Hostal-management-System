package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoomDto {
    @Id
   private String id;
   private String type;
   private String price;

    public RoomDto(String id, String type, String price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "RoomDto{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public RoomDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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



}
