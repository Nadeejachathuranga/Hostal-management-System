package Dao.Custom;

import Dto.RoomDto;
import Dto.RoomTypeDto;
import Entity.RoomsType;

import java.util.List;

public interface RoomDao  {
    void saveRoom(RoomDto roomDto);
    public List<RoomsType> getRoomType();
}
