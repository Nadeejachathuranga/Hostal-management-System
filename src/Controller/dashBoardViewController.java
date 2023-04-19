package Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class dashBoardViewController {
    public AnchorPane Anchorpane;
    public JFXButton btnRoomManage;
    public AnchorPane MainPane;
    public JFXButton btnStudentManage;

    public void RoomDevOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("/View/RoomsDevView.fxml");
        Parent load = FXMLLoader.load(resource);
        MainPane.getChildren().clear();
        MainPane.getChildren().add(load);
    }

    public void StudentManageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("/View/StudentDevView.fxml");
        Parent load = FXMLLoader.load(resource);
        MainPane.getChildren().clear();
        MainPane.getChildren().add(load);
    }
}
