package crud.backend.dao;

import common.DBUtils;
import crud.backend.model.Department;

import java.awt.dnd.DnDConstants;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentDao {

    //    Question 1: read data – get list departments
//    Tạo method để lấy ra danh sách tất cả các Department
//    Gợi ý:
//    Viết method getDepartments() và return ra List<Department>, Nếu có lỗi sẽ throw Exception lên frontend để in ra
//    Trên front-end sẽ gọi class DepartmentDao và demo method này.
    public static List<Department> getListDepartment(Connection conn) throws SQLException {
        Statement statement = conn.createStatement();

        ResultSet rs = statement.executeQuery("select * from department");
        List<Department> departmentList = new ArrayList<>();
        while (rs.next()) {
            Department department = new Department(rs.getInt(1), rs.getString(2));
            departmentList.add(department);
        }
        DBUtils.closeConn(conn, statement);
        return departmentList;
    }

    //    Question 2: read data – get department by id
//    Tạo method để lấy ra Department có id = 5
//    Gợi ý: Làm tương tự câu trên.
//    Nếu không có department nào có id = 5 thì sẽ in ra là "Cannot find department which has id = 5"
//    Nếu có lỗi sẽ throw Exception lên front-end để in ra
//    Trên front-end sẽ gọi class DepartmentDao và demo method này.

    //    Question 3: Tiếp tục Question 2 (read data – get department by id)
//    Không fix cứng id nữa mà sẽ dùng scanner để yêu cầu người dùng nhập vào id, sau đó trả về thông tin department có id như người dùng nhập vào
//    Gợi ý:
//    Trên backend sẽ viết method getDepartmentById(int id) và return ra Department
//    Nếu tìm thấy department có id = parameter thì sẽ return về department đó
//    Nếu không tìm thấy thì sẽ throw ra với message "Cannot find department which has id = " + id
//    Nếu có lỗi sẽ throw Exception lên front-end để in ra
//    Trên front-end sẽ gọi class DepartmentDao và demo method này
    public static Department getDepartmentById(Connection conn) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        PreparedStatement ps = conn.prepareStatement("select * from department where department_id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Department department = new Department();
        while (rs.next()) {
            department.setDepartmentId(rs.getInt(1));
            department.setDepartmentName(rs.getString(2));
        }
        ps.close();
        conn.close();
        if (department.getDepartmentId() == null || department.getDepartmentName() == null) {
            System.out.println("Cannot find department which has id = " + id);
            return null;
        }
        return department;
    }

    //    Question 4: check data exists – check department name exists
//    Tạo method để check department name có tồn tại hay không?
//    Gợi ý:
//    Trên backend sẽ viết method isDepartmentNameExists(String name) và return ra boolean
//    Nếu tìm thấy department đã có name = name parameter thì sẽ return true
//    Nếu không tìm thấy thì sẽ return ra false
//    Nếu có lỗi sẽ throw Exception lên front-end để in ra
//    Trên front-end sẽ gọi class DepartmentDao và demo method này
    public static boolean isDepartmentNameExists(Connection connection, String name) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("select exists (select 1 from department where department_name = ?)");
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        System.out.println(rs);
        while (rs.next() && rs.getInt(1) == 1) {
            return true;
        }
        return false;
    }

    public static boolean isDepartmentIdExists(Connection connection, int id) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("select exists (select 1 from department where department_id = ?)");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        System.out.println(rs);
        while (rs.next() && rs.getInt(1) == 1) {
            return true;
        }
        return false;
    }

    //    Question 5: create data – create department
//    Tạo method để người dùng có thể tạo được department
//    Gợi ý:
//    Trên backend sẽ viết method void createDepartment (String name)
//    Check xem đã có department nào có tên như parameter chưa (sử dụng method ở Question 6 để check)
//    Nếu tìm đã có department có tên như parameter thì throw ra Exception "Department Name is Exists!"
//    Nếu không tìm thấy thì sẽ create department
//    Nếu có lỗi sẽ throw Exception lên front-end để in ra
//    Trên front-end sẽ gọi class DepartmentDao và demo method này (dùng scanner để nhập thông tin của department muốn create)
    public static void createDepartment(Connection connection, String name) throws SQLException {
        if (DepartmentDao.isDepartmentNameExists(connection, name)) {
            throw new RuntimeException("Department Name is Exists!");
        }
        PreparedStatement ps = connection.prepareStatement("insert into department(department_name) values(?)");
        ps.setString(1, name);
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("tạo thành công department!");
        }
    }

    //    Question 6: update data – update department
//    Tạo method để người dùng có thể update được department name
//    Gợi ý:
//    Trên backend sẽ viết method void updateDepartmentName (int id, String newName)
//    Check xem đã có department nào có id như id parameter chưa (Viết thêm method như Question 6 để check, tên method là isDepartmentIdExists(int id))
//    Nếu không tìm thấy department có id = id parameter thì sẽ throw ra Exception có message "Cannot find department which has id = " + id
//    Nếu tìm thấy department có id = id parameter thì sẽ check xem tên mới của department có bị trùng không (sử dụng method ở Question 6 để check)
//    Nếu tìm đã có department có tên như parameter thì throw ra Exception "Department Name is Exists!"
//    Nếu không tìm thấy thì sẽ update department
//    Nếu có lỗi sẽ throw Exception lên front-end để in ra
//    Trên front-end sẽ gọi class DepartmentDao và demo method này(dùng scanner để nhập thông tin của department muốn update)
    public static void updateDepartment(Connection connection, int id, String newName) throws SQLException {
        if (DepartmentDao.isDepartmentNameExists(connection, newName)) {
            throw new RuntimeException("Department Name is Exists!");
        }
        if (!DepartmentDao.isDepartmentIdExists(connection, id)) {
            throw new RuntimeException("Cannot find department which has id = " + id);
        }
        PreparedStatement ps = connection.prepareStatement("update department set department_name = ? where department_id = ?");
        ps.setString(1, newName);
        ps.setInt(2, id);
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("update thành công department!");
        }
    }

    //    Question 7:
//    Tạo method để người dùng có thể xóa được department theo id mà user nhập vào
//    Gợi ý:
//    Trên backend sẽ viết method void deleteDepartment (int id)
//    Check xem đã có department nào có id như id parameter chưa (sử dụng method ở Question 6 để check)
//    Nếu không tìm thấy department có id = id parameter thì sẽ throw ra Exception có message "Cannot find department which has id = " + id
//    Nếu tìm thấy thì sẽ delete department đó
//    Nếu có lỗi sẽ throw Exception lên front-end để in ra
//    Trên front-end sẽ gọi class DepartmentDao và demo method này (dùng scanner để nhập vào id của department muốn delete)
    public static void deleteDepartment(Connection connection, int id) throws SQLException {
        if (!DepartmentDao.isDepartmentIdExists(connection, id)) {
            throw new RuntimeException("Cannot find department which has id = " + id);
        }
        PreparedStatement ps = connection.prepareStatement("delete from department where department_id = ?");
        ps.setInt(1, id);
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("delete thành công department!");
        }
    }

//    Question 8:
//    Làm các chức năng CRUD tương tự với table Account
//            (Chú ý: trong chức năng getListAccount, getById thì phải in ra cả thông tin tên của department

//    Exercise 3: Call Procedure
//    Question 1:
//    Tạo method để yêu cầu người dùng nhập vào id của department, sau đó sẽ xóa department đó. (sử dụng store procedure ở trong MySQL)
//    Gợi ý:
//    B1: Tạo 1 store procedure trong MySQL tên là sp_delete_department() có in parameter là id
//    B2: Trên backend sẽ viết method void deleteDepartmentUsingProcedure(int id)
//    Check xem đã có department nào có id như id parameter chưa (sử dụng method ở Question 6 để check)
//    Nếu không tìm thấy department có id = id parameter thì sẽ throw ra Exception có message
//"Cannot find department which has id = " + id
//    Nếu tìm thấy thì sẽ delete department đó
//    Nếu có lỗi sẽ throw Exception lên front-end để in ra
//
//    Trên front-end sẽ gọi class DepartmentDao và demo method này (dùng scanner để nhập vào id của department muốn delete)
    public static void deleteDepartmentUsingProcedure(Connection connection,int id) throws SQLException {
        if (!DepartmentDao.isDepartmentIdExists(connection, id)) {
            throw new RuntimeException("Cannot find department which has id = " + id);
        }
        PreparedStatement ps = connection.prepareStatement("call sp_delete_department(?)");
        ps.setInt(1, id);
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("delete thành công department bằng procedure!");
        }
    }

    public static void main(String[] args) {
        try {
            Connection connection = DBUtils.getConn();
//            for (Department d : DepartmentDao.getListDepartment(connection)) {
//                System.out.println(d.toString());
//            }


//            Object department = getDepartmentById(connection);
//            if (department instanceof Department){
//                System.out.println(department.toString());
//            }

//            System.out.println(DepartmentDao.isDepartmentNameExists("phan mem 2"));
            DepartmentDao.createDepartment(connection,"test2");
//            DepartmentDao.updateDepartment(connection, 7, "tesst1112");
//            DepartmentDao.deleteDepartment(connection, 7);
//            DepartmentDao.deleteDepartmentUsingProcedure(connection, 9);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
