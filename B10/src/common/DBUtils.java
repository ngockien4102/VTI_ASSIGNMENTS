package common;

import config.ConfigLoader;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Map;
import java.util.Properties;

public class DBUtils {

    private static Connection connection;

    public static Connection getConn(String url, String userName, String passWord) throws SQLException {
        Connection connection = DriverManager.getConnection(url, userName, passWord);
        return connection;
    }

    public static Connection getConn() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/testing_system";
        String userName = "root";
        String passWord = "1234";
        Connection connection = DriverManager.getConnection(url, userName, passWord);
        return connection;
    }

    public static void closeConn(Connection connection, Statement statement) throws SQLException {
        statement.close();
        connection.close();
    }

    public static ResultSet getData(Connection connection, String sql) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }

//    public static <k,v> int updateData(Connection connection, String sql, Map<k, v> listParam) throws SQLException {
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        int i = 1;
//        for (Map.Entry<k,v> m: listParam.entrySet()){
//            preparedStatement.setInt(1,);
//        }
//        preparedStatement.executeUpdate();
//    }

    //    Question 1:
//    Tạo method để test xem đã kết nối thành công tới sql chưa?
//    Gợi ý: Tạo method void isConnectedForTesting() và trong method sẽ thực hiện kết nối tới database và in ra "Connect success!", nếu không thì sẽ throw ra exception
    public static void isConnectedForTesting(Connection connection) throws SQLException {
        if (connection != null && connection.isValid(2)) {
            System.out.println("Connect success!");
        }
    }

    //
//    Question 2:
//    Tạo method để get Connect tới database.
//    Gợi ý:
//    Tạo method void connect() và trong method sẽ thực hiện check đã có connect hiện tại chưa (null & closed).
//    Nếu chưa connect thì sẽ thực hiện connect và return về connect vừa lấy được
//    Nếu connect rồi thì chỉ cần return ra connect hiện tại (không cần phải connect lại tới database)
//    Trong khi thực hiện nếu có lỗi gì thì sẽ throw ra Exception (để message Exception cho phù hợp)
//    Và Các constant nên config ở trong file properties
//            (VD như : username, password, driverName, message exception)
    public static Connection getConnect() throws Exception {
        Properties props = ConfigLoader.load();
        try {
            if (connection == null || connection.isClosed()) {
                String username = props.getProperty("db.username");
                String pass = props.getProperty("db.password");
                String url = props.getProperty("db.url");
                String driver = props.getProperty("db.driver-class-name");
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, pass);
            }
            System.out.println(connection);
            return connection;
        } catch (Exception e) {
            String messageErr = props.getProperty("db.message.exception");
            System.out.println(messageErr);
            throw new RuntimeException(e);
        }
    }

    //
//    Question 3:
//    Tạo method để get disconnect tới database.
//    Gợi ý:
//    Tạo method void disconnect() và trong method sẽ thực hiện check đã có connect hiện tại chưa (null & closed).
//    Nếu chưa connect thì sẽ không làm gì cả.
//    Nếu đã connect rồi thì disconnect
//    Trong khi thực hiện nếu có lỗi gì thì sẽ throw ra Exception (để message Exception cho phù hợp)
    public static void disConnect() throws Exception {
        Properties props = ConfigLoader.load();
        try {
            if (connection != null && !connection.isClosed()) {
                System.out.println("disconnect!!");
                connection.close();
            }
        } catch (SQLException e) {
            String messageErr = props.getProperty("db.message.exception");
            throw new RuntimeException(messageErr + " - " + e);
        }
    }

    public static void main(String[] args) throws Exception {
        DBUtils.getConnect();
        DBUtils.disConnect();
    }

}
