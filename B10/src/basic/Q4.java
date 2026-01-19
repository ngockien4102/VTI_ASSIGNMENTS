package basic;

import common.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q4 {
    public static int updatePositon(String name, int id){
        try {
            Connection connection = DBUtils.getConn();
            String sql = "update position set position_name = ? where position_id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2,id);
            int rs = ps.executeUpdate();
            connection.close();
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(Q4.updatePositon("dev", 5));
    }
}
