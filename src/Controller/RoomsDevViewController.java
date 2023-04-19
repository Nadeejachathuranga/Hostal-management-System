package Controller;

import Bo.Custom.Impl.RoomBoImpl;
import Bo.Custom.Impl.RoomTypeImpl;
import Bo.Custom.RoomBo;
import Bo.Custom.RoomTypeBo;
import Dto.RoomTypeDto;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class RoomsDevViewController {
    public JFXButton btnManageRooms;
    public AnchorPane roomPane;
    public AnchorPane MainRoomPane;
    public JFXTextField txtroomPrice;
    public JFXButton btnSaveNewRoomType;
    public JFXTextField txtroomType;

    public void ManageRoomsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("/View/RoomFunctionsView.fxml");
        Parent load = FXMLLoader.load(resource);
        MainRoomPane.getChildren().clear();
        MainRoomPane.getChildren().add(load);
    }

    public void SaveNewRoomOnAction(ActionEvent actionEvent) {
        String Type=txtroomType.getText();
        String Price=txtroomPrice.getText();

        RoomTypeBo roomType = new RoomTypeImpl();
        roomType.save(new RoomTypeDto(Type,Price));


    }
}
