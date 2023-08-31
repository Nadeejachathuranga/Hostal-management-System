package Utill;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class utill {
    public static <T>T Execute(String sql ,Object...args) throws SQLException, ClassNotFoundException {

        PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            preparedStatement.setObject((i + 1), args[i]);
        }
        if (sql.startsWith("select") | sql.startsWith("SELECT")) {
            return (T) preparedStatement.executeQuery();
        }
        return (T)(Boolean)(preparedStatement.executeUpdate() > 0);

    }
}
