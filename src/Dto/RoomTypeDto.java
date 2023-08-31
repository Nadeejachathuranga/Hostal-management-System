package Dto;

public class RoomTypeDto {
    private String Rtype;
    private String price;

    public RoomTypeDto(String rtype, String price) {
        Rtype = rtype;
        this.price = price;
    }

    public String getRtype() {
        return Rtype;
    }

    public void setRtype(String rtype) {
        Rtype = rtype;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RoomTypeDto{" +
                "Rtype='" + Rtype + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public RoomTypeDto() {
    }
}
