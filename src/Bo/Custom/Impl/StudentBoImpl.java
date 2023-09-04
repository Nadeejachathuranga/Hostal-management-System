package Bo.Custom.Impl;

import Bo.Custom.StudentBo;
import Dao.Custom.Impl.RoomDaoImpl;
import Dao.Custom.Impl.StudentDaoImpl;
import Dto.StudentDto;
import Entity.Student;

public class StudentBoImpl implements StudentBo {
    @Override
    public void SaveNewStudent(StudentDto studentDto) {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        RoomDaoImpl roomDao = new RoomDaoImpl();
        studentDao.SaveNewStudent(new Student(studentDto.getId(),studentDto.getName(),studentDto.getRoomId()));

    }
}
