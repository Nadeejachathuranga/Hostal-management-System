package Bo.Custom.Impl;

import Bo.Custom.RoomBo;
import Dao.Custom.Impl.RoomDaoImpl;
import Dao.Custom.RoomDao;
import Dto.RoomDto;
import Entity.RoomsType;

import java.util.ArrayList;
import java.util.List;


public class RoomBoImpl implements RoomBo {
    RoomDao roomDao =new RoomDaoImpl();
    @Override
    public void SaveRoom(RoomDto roomDto) {

        roomDao.saveRoom(roomDto);
    }

    @Override
    public ArrayList<RoomsType> getRoomsTypeCombo() {
        ArrayList<RoomsType> roomsTypes = new ArrayList<>();
        List<RoomsType> roomType = roomDao.getRoomType();
        for (RoomsType a:roomType) {
            roomsTypes.add((RoomsType) roomType);
        }
        return roomsTypes;
    }


}
