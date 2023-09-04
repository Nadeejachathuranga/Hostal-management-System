package Dao.Custom;

import Dto.RoomDto;
import Dto.RoomTypeDto;
import Entity.Rooms;
import Entity.RoomsType;
import Entity.Student;

import java.util.List;

public interface RoomDao  {
    void saveRoom(Rooms rooms);
    public List<RoomsType> getRoomType();
    void UpdateRoomStatus(Rooms rooms);
}
