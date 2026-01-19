package basic;

import common.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q3 {
    public static int insertPositon(String name){
        try {
            Connection connection = DBUtils.getConn();
            String sql = "insert into position (position_name) " +
                         "values(?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            int rs = ps.executeUpdate();
            connection.close();
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(Q3.insertPositon("test1"));
    }
}
