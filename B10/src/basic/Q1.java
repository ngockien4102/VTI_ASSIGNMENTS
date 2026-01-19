package basic;

import common.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class Q1 {
    public static void main(String[] args) {
        try {
            Connection connection = DBUtils.getConn();
            if (connection != null){
                System.out.println("Connect success!");
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
