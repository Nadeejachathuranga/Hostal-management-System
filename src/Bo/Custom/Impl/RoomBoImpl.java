package Bo.Custom.Impl;

import Bo.Custom.RoomBo;
import Dao.Custom.Impl.RoomDaoImpl;
import Dao.Custom.Impl.StudentDaoImpl;
import Dao.Custom.RoomDao;
import Dto.RoomDto;
import Dto.StudentDto;
import Entity.Rooms;
import Entity.RoomsType;
import Entity.Student;

import java.util.ArrayList;
import java.util.List;


public class RoomBoImpl implements RoomBo {

    @Override
    public void SaveRoom(RoomDto roomDto) {
        RoomDaoImpl roomDao = new RoomDaoImpl();

        roomDao.saveRoom(new Rooms(roomDto.getId(),roomDto.getType(),roomDto.getPrice()));
    }

    @Override
    public ArrayList<RoomsType> getRoomsTypeCombo() {
        RoomDao roomdao =new RoomDaoImpl();
        ArrayList<RoomsType> roomsTypes = new ArrayList<>();
        List<RoomsType> roomType = roomdao.getRoomType();
        for (RoomsType a:roomType) {
            roomsTypes.add((RoomsType) roomType);
        }
        return roomsTypes;
    }

    @Override
    public void UpdateRoomStatus(StudentDto studentDto) {
        RoomDaoImpl roomDao = new RoomDaoImpl();
        roomDao.UpdateRoomStatus(new Rooms(studentDto.getRoomId(),studentDto.getId()));
    }


}
