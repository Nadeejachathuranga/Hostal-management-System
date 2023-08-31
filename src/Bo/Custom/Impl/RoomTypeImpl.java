package Bo.Custom.Impl;

import Bo.Custom.RoomTypeBo;
import Dao.Custom.Impl.RoomTypeDaoImpl;
import Dao.Custom.RoomTypeDao;
import Dto.RoomTypeDto;
import Entity.RoomsType;

import java.util.ArrayList;
import java.util.List;

public class RoomTypeImpl implements RoomTypeBo {
    @Override
    public void save(RoomTypeDto roomTypeDto) {
        RoomTypeDao roomTypeDao = new RoomTypeDaoImpl();
        roomTypeDao.save(new RoomsType(roomTypeDto.getRtype(),roomTypeDto.getPrice()));
    }

    @Override
    public ArrayList GetCategoryToCombo() {
        RoomTypeDaoImpl roomTypeDao = new RoomTypeDaoImpl();
        List<RoomsType> categoryToCombo = roomTypeDao.getCategoryToCombo();
        ArrayList<RoomsType> roomsTypes = new ArrayList<>();

        for (RoomsType a:categoryToCombo) {
            roomsTypes.add((RoomsType) categoryToCombo);
        }
        return roomsTypes;
    }
}
