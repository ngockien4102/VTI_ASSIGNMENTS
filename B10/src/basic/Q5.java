package basic;

import common.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q5 {
    public static int deletePositon(int id){
        try {
            Connection connection = DBUtils.getConn();
            String sql = "delete from position where position_id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            connection.close();
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(Q5.deletePositon(6));
    }
}
