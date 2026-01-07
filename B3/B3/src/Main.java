import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Exercise 1: Datatype Casting
//        Question 1:
//        Khai báo 2 số lương có kiểu dữ liệu là float.
//                Khởi tạo Lương của Account 1 là 5240.5 $
//        Khởi tạo Lương của Account 2 là 10970.055$
//        Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//        Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
//          Account account = new Account();
//          account.salary = 5240.5f;
//          Account account2 = new Account();
//          account2.salary = 10970.055f;
//
//          int rount_salary_acc1 = (int) account.salary;
//          int rount_salary_acc2 = (int) account2.salary;
//
////        System.out.println(rount_salary_acc1);
////        System.out.println(rount_salary_acc2);
//
//
////        Question 2:
////        Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho      đủ 5 chữ số)
//        Random random = new Random();
//        int num = random.nextInt(10000) + 1000;
//        String ranNum = String.valueOf(num);
//        System.out.println(ranNum.length() == 4 ? "0" + ranNum : ranNum);
//
////        Question 3:
////        Lấy 2 số cuối của số ở Question 2 và in ra.
////                Gợi ý:
////        Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//        System.out.println(ranNum.substring(2,4));
////        Cách 2: chia lấy dư số đó cho 100
//        int subNum = num % 100;
//
////        Question 4:10
////        Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng.
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào số a: ");
//        int a = sc.nextInt();
//        System.out.print("Nhập vào số b: ");
//        int b = sc.nextInt();
////        System.out.println(a/b);
//
//
////                Exercise 2: Default value
////        Question 1:
////        Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
////    ∙ Email: "Email 1"
////    ∙ Username: "User name 1"
////    ∙ FullName: "Full name 1"
////    ∙ CreateDate: now
//
//        Account[] accounts = new Account[5];
//        for (int i = 1; i < accounts.length; i++) {
//            Account acc = new Account();
//            acc.email = "Email " + i;
//            acc.userName = "User name " + i;
//            acc.fullName = "Full name " + i;
//            acc.createDate = LocalDate.now();
//            accounts[i] = acc;
//        }
//
////        Exercise 3: Boxing & Unboxing
////        Question 1:
////        Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
////        Sau đó convert lương ra float và hiển thị lương lên màn hình (với số float có 2 số sau dấu thập phân).
//        Integer sal = 5000;
//        float fSal = sal;
//        System.out.printf("salary: %.2f", fSal);
//        System.out.println();
//
////        Question 2:
////        Khai báo 1 String có value = "1234567"
////        Hãy convert String đó ra số int
//        String value = "1234567";
//        int val = Integer.parseInt(value);
//        System.out.println(val);
//
////        Question 3:
////        Khởi tạo 1 số Integer có value là chữ "1234567"
////        Sau đó convert số trên thành datatype int
//        Integer priVal = 1234567;
//        int refVal = priVal;
//
////        Exercise 4: String
////        Question 1:
////        Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng );
//        System.out.println("Nhập vào một xâu kí tự: ");
//        sc.nextLine();
//        String ex4 = sc.nextLine();
//        int countEx4 = 0;
//        for (char c: ex4.toCharArray()){
//            if (!Character.isWhitespace(c)){
//                countEx4++;
//            }
//        }
//
////        Question 2:
////        Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
//        System.out.print("Nhập vào s1: ");
//        String s1 = sc.nextLine();
//        System.out.print("Nhập vào s2: ");
//        String s2 = sc.nextLine();
//        s2.concat(s1);
//
////        Question 3:
////        Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chữ viết hoa chữ cái đầu thì viết hoa lên.
//        System.out.print("nhập vào tên người dùng: ");
//        String name = sc.nextLine().trim();
//        if (!name.isEmpty() && name != null && Character.isLowerCase(name.charAt(0))){
//            name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
//        }
//
////                Question 4:
////        Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
////        VD:
////        Người dùng nhập vào "Nam", hệ thống sẽ in ra
////        "Ký tự thứ 1 là: N"
////        "Ký tự thứ 1 là: A"
////        "Ký tự thứ 1 là: M"
//        System.out.print("Nhập vào tên người dùng: ");
//        String userName = sc.nextLine();
//        char[] strUserName = userName.toCharArray();
//        for (int i = 0; i < strUserName.length; i++) {
//            System.out.println("Ký tự thứ " + i + " là: " + strUserName[i]);
//        }
//
////        Question 5:
////        Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ.
//        System.out.print("Nhập vào họ: ");
//        String lastName = sc.nextLine();
//        System.out.print("Nhập vào tên đệm: ");
//        String midName = sc.nextLine();
//        System.out.println("Nhập vào tên: ");
//        String firstName = sc.nextLine();
//        System.out.println("Họ và tên: " + lastName + " " + midName + " " + firstName);
//
////                Question 6:
////        Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm
////        VD:
////        Người dùng nhập vào "Nguyễn Văn Nam"
////        Hệ thống sẽ in ra
////        "Họ là: Nguyễn"
////        "Tên đệm là: Văn"
////        "Tên là: Nam"
//        System.out.println("Nhập vào đầy đủ họ và tên: ");
//        String fullname = sc.nextLine();
//        String[] splitName = fullname.split("\\s");
//        System.out.println("Họ là: " + splitName[0]);
//        System.out.println("Tên đệm là: " + splitName[1]);
//        System.out.println("Tên là: " + splitName[2]);

//        Question 7:
//        Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên của họ như sau:
//        a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
//        VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn   nam"
//        System.out.println("input fullname");
////        String inputName = sc.nextLine().trim();
        String inputName = "nguyen ngoc   kien";
        String[] split = inputName.split("\\s");
//        for (String s : split){
//            if (s.equals(" ") || s.isEmpty()){
//                continue;
//            }
//            System.out.print(s + " ");
//
//        }
//        System.out.println(inputName.replaceAll("\\s+", " "));

//        b) Viết hoa chữ cái mỗi từ của người dùng
//        VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"
        for (String s : split){
            if (s.equals(" ") || s.isEmpty()){
                continue;
            }
            System.out.print(s.toUpperCase().charAt(0) + s.substring(1) + " ");

        }

//        Question 8:
//        In ra tất cả các group có chứa chữ "Java"
//
//
//        Question 9:
//        In ra tất cả các group "Java"
//
//
//        Question 10:
//        Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//                Nếu có xuất ra “OK” ngược lại “KO”.
//        Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
//
//
//        Question 11: Count special Character
//        Tìm số lần xuất hiện ký tự "a" trong chuỗi
//
//
//        Question 12: Reverse String
//        Đảo ngược chuỗi sử dụng vòng lặp
//
//
//        Question 13:
//        String not contains digit
//        Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
//                Ví dụ:
//        "abc" => true
//        "1abc", "abc1", "123", "a1bc", null => false
//
//
//        Question 14: Replace character
//        Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
//                Ví dụ:
//        "VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
//
//
//        Question 15: Revert string by word
//        Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
//                Ví dụ: " I am developer " => "developer am I".
//                Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//        Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt chuỗi theo dấu cách
//
//
//        Question 16:
//        Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần bằng nhau với n    ký tự. Nếu chuỗi không chia được thì xuất ra màn hình “KO”.
//
//
//        Exercise 5: Object’s Method
//        Question 1:
//        In ra thông tin của phòng ban thứ 1 (sử dụng toString())
//
//
//        Question 2:
//        In ra thông tin của tất cả phòng ban (sử dụng toString())
//
//
//        Question 3:
//        In ra địa chỉ của phòng ban thứ 1
//
//
//        Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
//
//
//                Question 5:
//        So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
//
//
//        Question 6:
//        Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//        VD:
//        Accounting
//        Boss of director
//                Marketing
//        Sale
//        Waiting room
//
//
//        Question 7:
//        Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra dan sách phòng ban được sắp xếp theo tên
//        VD:
//        Accounting
//        Boss of director
//                Marketing
//        waiting room
//        Sale
    }
}