package Dto;

public class StudentDto {
    String id;
    String name;
    String roomId;

    public StudentDto(String id, String name, String roomId) {
        this.id = id;
        this.name = name;
        this.roomId = roomId;
    }

    public StudentDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}
