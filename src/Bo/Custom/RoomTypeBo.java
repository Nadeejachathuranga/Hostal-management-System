package Bo.Custom;

import Dto.RoomTypeDto;

import java.util.ArrayList;

public interface RoomTypeBo {
    public void save(RoomTypeDto roomTypeDto);
    public ArrayList GetCategoryToCombo();
}
