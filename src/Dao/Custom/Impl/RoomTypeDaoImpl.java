package Dao.Custom.Impl;

import Dao.Custom.RoomTypeDao;
import Dto.RoomTypeDto;
import Entity.RoomsType;
import Utill.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.ArrayList;
import java.util.List;

public class RoomTypeDaoImpl implements RoomTypeDao {

    @Override
    public void save(RoomsType roomsType) {

            Session session = SessionFactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
        try {
            session.save(roomsType);
            transaction.commit();

        }catch (Exception e){

        }finally {
            session.close();
        }
        System.out.println("****");
        System.out.println("****");
    }

    @Override
    public List getCategoryToCombo() {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        String sql = "select rtype from Roomstype";
        NativeQuery sqlQuery = session.createSQLQuery(sql);
        sqlQuery.addEntity(RoomsType.class);
        List<RoomsType> list = sqlQuery.list();
        return list;
    }
}
