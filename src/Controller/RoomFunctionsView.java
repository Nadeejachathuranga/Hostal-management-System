package Controller;

import Bo.Custom.Impl.RoomBoImpl;
import Bo.Custom.RoomBo;
import Dao.Custom.Impl.RoomDaoImpl;
import Dao.Custom.RoomDao;
import Dto.RoomDto;
import Entity.RoomsType;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class RoomFunctionsView implements Initializable {
    public JFXButton btnNewRoom;
    public JFXTextField roomQuntity;
    public JFXComboBox roomTypeCombo;
    public JFXButton btnSaveNewRoom;
    public JFXTextField roomId;
    public JFXTextField roomType;

    public void newRoomFormOnAction(ActionEvent actionEvent) {

    }

    public void SaveNewRoomOnAction(ActionEvent actionEvent) {
        String id=roomId.getText();
        String type= (String) roomTypeCombo.getValue();
        String quantity=roomQuntity.getText();

        RoomBo roomBo = new RoomBoImpl();
        roomBo.SaveRoom(new RoomDto(id,type,quantity));
    }
    public void getCombo(){

        try {
            RoomBo roomBo = new RoomBoImpl();
            ArrayList<RoomsType> roomsTypeCombo = roomBo.getRoomsTypeCombo();
            ObservableList<Object> objects = FXCollections.observableArrayList();
            for (RoomsType name : roomsTypeCombo) {
                objects.add(name);
            }
            roomTypeCombo.setItems(objects);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        getCombo();
    }
}
