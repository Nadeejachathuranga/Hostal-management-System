package Dao.Custom.Impl;

import Bo.Custom.Impl.RoomBoImpl;
import Dao.Custom.StudentDao;
import Entity.Student;
import Utill.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void SaveNewStudent(Student student) {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(student);
            transaction.commit();
        }catch (Exception e){
            System.out.println(e);
        }finally {
           session.close();
        }
    }
}
