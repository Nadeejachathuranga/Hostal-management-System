package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class StudentDevViewController {
    public AnchorPane MainStudentPain;

    public void StudentRegistrationOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("/View/StudentFunctionView.fxml");
        Parent load = FXMLLoader.load(resource);
        MainStudentPain.getChildren().clear();
        MainStudentPain.getChildren().add(load);
    }
}
