package Controller;

import Bo.Custom.Impl.RoomBoImpl;
import Bo.Custom.Impl.RoomTypeImpl;
import Bo.Custom.RoomBo;
import Dao.Custom.Impl.RoomDaoImpl;
import Dao.Custom.RoomDao;
import Dto.RoomDto;
import Entity.RoomsType;
import Utill.Sql;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class RoomFunctionsView implements Initializable {
    public JFXButton btnNewRoom;
    public JFXTextField roomQuntity;
    public JFXComboBox roomTypeCombo;
    public JFXButton btnSaveNewRoom;
    public JFXTextField roomId;
    public JFXTextField roomType;
    public AnchorPane RoomFunctionNavPane;

    public void newRoomFormOnAction(ActionEvent actionEvent) {
        getCombo();
    }

    public void SaveNewRoomOnAction(ActionEvent actionEvent) {
        String id=roomId.getText();
        String type= (String) roomTypeCombo.getValue();
        String quantity=roomQuntity.getText();
        RoomDto roomDto = new RoomDto(id, type, quantity);
        RoomBoImpl roomBo = new RoomBoImpl();
        roomBo.SaveRoom(roomDto);

    }
    public void getCombo(){
        Sql sql = new Sql();
        try {
            ArrayList roomTypeToCombo = sql.getRoomTypeToCombo();
            ObservableList<Object> object = FXCollections.observableArrayList();
            for (Object name : roomTypeToCombo) {
                object.add(name);
            }
            roomTypeCombo.setItems(object);
            System.out.println(roomTypeToCombo);
        }catch (Exception e){
            System.out.println(e);
        }


     /*   try {
            RoomTypeImpl roomType = new RoomTypeImpl();
            ArrayList<RoomsType> arrayList = roomType.GetCategoryToCombo();
            ObservableList<Object> objects = FXCollections.observableArrayList();
            for (RoomsType name : arrayList) {
                objects.add(name);
            }
            roomTypeCombo.setItems(objects);
        }catch (Exception e){
            System.out.println(e);
        }*/
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        getCombo();
    }
}
