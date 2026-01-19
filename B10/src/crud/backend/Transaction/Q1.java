package crud.backend.Transaction;

import common.DBUtils;
import crud.backend.dao.DepartmentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q1 {
    //    Exercise 4: Transaction
//    Question 1:
//    Tạo 1 method để thực thi các bước sau:
//    B1: xóa tất cả các nhân viên thuộc phòng ban 3
//    B2: xóa phòng ban 3
//    Với điều kiện: khi xóa B1 bị lỗi thì sẽ rollback lại
    public static void deleteAllAccountOfDepartment(Connection connection, int id) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("delete from account where department_id=?");
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DBUtils.getConn();
            connection.setAutoCommit(false);
            int id = 11;
            Q1.deleteAllAccountOfDepartment(connection, id);
            DepartmentDao.deleteDepartment(connection, id);
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            System.out.println("rollback");
            throw new RuntimeException(e);
        }

    }
}
