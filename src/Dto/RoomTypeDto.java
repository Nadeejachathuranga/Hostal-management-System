package Dto;

public class RoomTypeDto {
    private String type;
    private String price;

    @Override
    public String toString() {
        return "RoomTypeDto{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public RoomTypeDto() {
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

    public RoomTypeDto(String type, String price) {
        this.type = type;
        this.price = price;
    }
}
