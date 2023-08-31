package Utill;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Sql {
    public ArrayList getRoomTypeToCombo() throws SQLException, ClassNotFoundException {
        String sql="select rtype from roomstype";
        ArrayList arrayList = new ArrayList();
        ResultSet execute = utill.Execute(sql);
        arrayList.add("Ac");
            if (execute.next()){
                while (execute.next()) {
                    arrayList.add(execute.getString(1));
                }
            }
       return  arrayList;
    }
}
