package Dao.Custom;

import Dto.RoomTypeDto;
import Entity.RoomsType;

import java.util.ArrayList;
import java.util.List;

public interface RoomTypeDao {
    public void save(RoomsType roomsType);
    public List getCategoryToCombo();
}
