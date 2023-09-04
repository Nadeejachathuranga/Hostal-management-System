package Bo.Custom;

import Dto.RoomDto;
import Dto.StudentDto;
import Entity.RoomsType;

import java.util.ArrayList;

public interface RoomBo {

    void SaveRoom(RoomDto roomDto);
    public ArrayList<RoomsType> getRoomsTypeCombo();
    void UpdateRoomStatus(StudentDto studentDto);
}
