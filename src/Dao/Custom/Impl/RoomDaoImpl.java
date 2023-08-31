package Dao.Custom.Impl;

import Dao.Custom.RoomDao;
import Dto.RoomDto;
import Entity.Rooms;
import Entity.RoomsType;
import Utill.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class RoomDaoImpl implements RoomDao {
    @Override
    public void saveRoom(Rooms rooms) {
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(rooms);
        transaction.commit();
        session.close();
    }

    @Override
    public List<RoomsType> getRoomType() {

            Session session = SessionFactoryConfiguration.getInstance().getSession();
            String sql = "select rtype from Roomstype";
            NativeQuery sqlQuery = session.createSQLQuery(sql);
         //   sqlQuery.addEntity(RoomsType.class);
            List<RoomsType> list = sqlQuery.list();
            if (list.isEmpty()){
                System.out.println("***Empty");
            }
            return list;
    }
}
