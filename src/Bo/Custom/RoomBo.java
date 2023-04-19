package Bo.Custom;

import Dto.RoomDto;
import Entity.RoomsType;

import java.util.ArrayList;

public interface RoomBo {

    void SaveRoom(RoomDto roomDto);
    public ArrayList<RoomsType> getRoomsTypeCombo();
}
