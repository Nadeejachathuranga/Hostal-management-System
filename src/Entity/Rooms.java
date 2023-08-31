package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rooms {
    @Id
    String id;
    String type;
    String status;

    public Rooms(String id, String type, String status) {
        this.id = id;
        this.type = type;
        this.status = status;
    }

    public Rooms() {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
