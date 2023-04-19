package Bo.Custom.Impl;

import Bo.Custom.RoomTypeBo;
import Dao.Custom.Impl.RoomTypeDaoImpl;
import Dao.Custom.RoomTypeDao;
import Dto.RoomTypeDto;
import Entity.RoomsType;

public class RoomTypeImpl implements RoomTypeBo {
    @Override
    public void save(RoomTypeDto roomTypeDto) {
        RoomTypeDao roomTypeDao = new RoomTypeDaoImpl();
        roomTypeDao.save(new RoomsType(roomTypeDto.getType(),roomTypeDto.getPrice()));
    }
}
