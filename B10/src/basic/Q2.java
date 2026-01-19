package basic;

import common.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q2 {
    public static void getInfoPostion(){
        try {
            Connection connection = DBUtils.getConn();
            String sql = "select * from position";
            ResultSet rs = DBUtils.getData(connection, sql);
            while (rs.next()){
                System.out.println("id: "+rs.getInt("position_id") + " name: "+rs.getString("position_name"));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Q2.getInfoPostion();
    }
}
