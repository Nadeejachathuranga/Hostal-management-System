package Controller;

import Bo.Custom.Impl.RoomBoImpl;
import Bo.Custom.Impl.StudentBoImpl;
import Dto.StudentDto;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;

public class StudentFunctionView {
    public JFXTextField txtStudentName;
    public JFXTextField txtStudentId;
    public JFXTextField txtStudentRoomId;

    public void SaveNewStudentOnAction(ActionEvent actionEvent) {
    String id=txtStudentId.getText();
    String name=txtStudentName.getText();
    String roomId=txtStudentRoomId.getText();
        StudentDto studentDto = new StudentDto(id, name, roomId);
        StudentBoImpl studentBo = new StudentBoImpl();
        studentBo.SaveNewStudent(studentDto);
        RoomBoImpl roomBo = new RoomBoImpl();
        roomBo.UpdateRoomStatus(studentDto);
    }
}
