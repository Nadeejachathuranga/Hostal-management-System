package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    String id;
    String name;
    String roomId;

    public Student(String id, String name, String roomId) {
        this.id = id;
        this.name = name;
        this.roomId = roomId;
    }

    public Student() {
    }


    public Student(String roomId, String id) {
        this.roomId=roomId;
        this.id=id;
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
