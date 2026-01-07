import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //        Table 1:Department
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "sale";

        Department department2 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "marketing";

        Department department3 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "it";

//        Table 2: Position
        Position position1 = new Position();
        position1.positionId = 1;
        position1.positionName = PositionName.PM;

        Position position2 = new Position();
        position2.positionId = 1;
        position2.positionName = PositionName.DEV;

        Position position3 = new Position();
        position3.positionId = 1;
        position3.positionName = PositionName.SCRUMMASTER;

//        Table 3: Account
        Account account1 = new Account();
        account1.accountId = 1;
        account1.email = "a@gmail.com";
        account1.userName = "anv";
        account1.fullName = "nguyen van a";
        account1.department = department1;
        account1.position = position1;
        account1.createDate = new Date();

        Account account2 = new Account();
        account2.accountId = 2;
        account2.email = "b@gmail.com";
        account2.userName = "bnv";
        account2.fullName = "nguyen van b";
        account2.department = department2;
        account2.position = position2;
        account2.createDate = new Date();

        Account account3 = new Account();
        account3.accountId = 3;
        account3.email = "c@gmail.com";
        account3.userName = "cnv";
        account3.fullName = "nguyen van c";
        account3.department = department3;
        account3.position = position3;
        account3.createDate = new Date();

//        Table 4: Group
        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "g1";
        group1.creator = account1;
        group1.createDate = new Date();

        Group group2 = new Group();
        group2.groupId = 2;
        group2.groupName = "g2";
        group2.creator = account2;
        group2.createDate = new Date();

        Group group3 = new Group();
        group3.groupId = 3;
        group3.groupName = "";
        group3.creator = account3;
        group3.createDate = new Date();

//        Table 5: GroupAccount
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.group = group1;
        groupAccount1.account = account1;
        groupAccount1.joinDate = new Date();

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.group = group2;
        groupAccount2.account = account2;
        groupAccount2.joinDate = new Date();

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.group = group3;
        groupAccount3.account = account3;
        groupAccount3.joinDate = new Date();

//        Table 6: TypeQuestion
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.typeId = 1;
        typeQuestion1.typeName = TypeName.ESSAY;

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.typeId = 2;
        typeQuestion2.typeName = TypeName.MULTIPLECHOICE;

//        Table 7: CategoryQuestion
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.categoryId = 1;
        categoryQuestion1.categoryName = "java";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.categoryId = 2;
        categoryQuestion2.categoryName = "Net";

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.categoryId = 3;
        categoryQuestion3.categoryName = "Sql";

//        Table 8: Question
        Question question1 = new Question();
        question1.questionId = 1;
        question1.content = "cau 1";
        question1.categoryQuestion = categoryQuestion1;
        question1.typeQuestion = typeQuestion1;
        question1.creator = account1;
        question1.createDate = new Date();

        Question question2 = new Question();
        question2.questionId = 2;
        question2.content = "cau 2";
        question2.categoryQuestion = categoryQuestion2;
        question2.typeQuestion = typeQuestion2;
        question2.creator = account2;
        question2.createDate = new Date();

        Question question3 = new Question();
        question3.questionId = 3;
        question3.content = "cau 3";
        question3.categoryQuestion = categoryQuestion3;
        question3.typeQuestion = typeQuestion2;
        question3.creator = account3;
        question3.createDate = new Date();

//        Table 9: Answer
        Answer answer1 = new Answer();
        answer1.answerId = 1;
        answer1.content = "asw1";
        answer1.question = question1;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.answerId = 2;
        answer2.content = "asw2";
        answer2.question = question1;
        answer2.isCorrect = false;

        Answer answer3 = new Answer();
        answer3.answerId = 3;
        answer3.content = "asw3";
        answer3.question = question1;
        answer3.isCorrect = false;

//        Table 10: Exam
        Exam exam1 = new Exam();
        exam1.examId = 1;
        exam1.code = "ex1";
        exam1.title = "exam1";
        exam1.categoryQuestion = categoryQuestion1;
        exam1.duration = 30;
        exam1.creator = account1;
        exam1.createDate = new Date();

        Exam exam2 = new Exam();
        exam2.examId = 2;
        exam2.code = "ex2";
        exam2.title = "exam2";
        exam2.categoryQuestion = categoryQuestion2;
        exam2.duration = 90;
        exam2.creator = account2;
        exam2.createDate = new Date();

        Exam exam3 = new Exam();
        exam3.examId = 3;
        exam3.code = "ex3";
        exam3.title = "exam3";
        exam3.categoryQuestion = categoryQuestion3;
        exam3.duration = 60;
        exam3.creator = account3;
        exam3.createDate = new Date();

//        Table 11: ExamQuestion
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.examId = 1;
        examQuestion1.question = question1;

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.examId = 2;
        examQuestion2.question = question2;

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.examId = 3;
        examQuestion3.question = question3;


//        Question 1:
//        Kiểm tra account thứ 2
//        Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
//        Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
        if (account2.department == null){
            System.out.println("Nhân viên này chưa có phòng ban");
        }else {
            System.out.println("Phòng ban của nhân viên này là " + account2.department.departmentName);
        }

//        Question 2:
//        Kiểm tra account thứ 2
//        Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//        Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
//        Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
//        Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"

        int count = 0;
        if (groupAccount1.account.accountId == 2){
            count++;
        }
        if (groupAccount2.account.accountId == 2){
            count++;
        }
        if (groupAccount3.account.accountId == 2){
            count++;
        }

        if (count == 0){
            System.out.println("Nhân viên này chưa có group");
        }else if (count == 1 || count == 2){
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        }else if (count == 3){
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        }else if (count == 4){
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

//        Question 3:
//        Sử dụng toán tử ternary để làm Question 1
        System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là " + account2.department.departmentName);

//        Question 4:
//        Sử dụng toán tử ternary để làm yêu cầu sau:
//        Kiểm tra Position của account thứ 1
//        Nếu Position = Dev thì in ra text "Đây là Developer"
//        Nếu không phải thì in ra text "Người này không phải là Developer"

        System.out.println(account1.position.positionName.equals("Dev") ? "Đây là Developer" : "Người này không phải là Developer");

//        SWITCH CASE
//        Question 5:
//        Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//        Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//        Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//        Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//        Còn lại in ra "Nhóm có nhiều thành viên"
        int countQ5 = 0;
        if (groupAccount1.account.accountId == 1){
            countQ5++;
        }
        if (groupAccount2.account.accountId == 1){
            countQ5++;
        }
        if (groupAccount3.account.accountId == 1){
            countQ5++;
        }

        switch (countQ5){
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
        }

//        Question 6:
//        Sử dụng switch case để làm lại Question 2
        int countQ6 = 0;
        if (groupAccount1.account.accountId == 2){
            countQ6++;
        }
        if (groupAccount2.account.accountId == 2){
            countQ6++;
        }
        if (groupAccount3.account.accountId == 2){
            countQ6++;
        }

        switch (countQ6){
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
        }



//        Question 7:
//        Sử dụng switch case để làm lại Question 4
//
//
//        FOREACH
//        Question 8:
//        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
//
//
//        Question 9:
//        In ra thông tin các phòng ban bao gồm: id và name
//
//
//                FOR
//        Question 10:
//        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//        họ theo định dạng như sau:
//        Thông tin account thứ 1 là:
//        Email: NguyenVanA@gmail.com
//        Full name: Nguyễn Văn A
//        Phòng ban: Sale
//        Thông tin account thứ 2 là:
//        Email: NguyenVanB@gmail.com
//        Full name: Nguyễn Văn B
//        Phòng ban: Marketting
//
//
//        Question 11:
//        In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//        Thông tin department thứ 1 là:
//        Id: 1
//        Name: Sale
//        Thông tin department thứ 2 là:
//        Id: 2
//        Name: Marketing
//
//
//        Question 12:
//        Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
//
//
//        Question 13:
//        In ra thông tin tất cả các account ngoại trừ account thứ 2
//
//
//        Question 14:
//        In ra thông tin tất cả các account có id < 4
//
//
//        Question 15:
//        In ra các số chẵn nhỏ hơn hoặc bằng 20
//
//
//        WHILE
//        Question 16:
//        Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//        lệnh break, continue
//
//
//                DO-WHILE
//        Question 17:
//        Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
//        lệnh break, continue
//
//
//                Exercise 2: System out printf
//        Question 1:
//        Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//        nguyên đó
//
//
//        Question 2:
//        Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//        ra số nguyên đó thành định dạng như sau: 100,000,000
//
//
//        Question 3:
//        Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//        thực đó chỉ bao gồm 4 số đằng sau
//
//
//        Question 4:
//        Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//        dạng như sau:
//        Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//        Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
//
//
//                Question 5:
//        Lấy thời gian bây giờ và in ra theo định dạng sau:
//        24/04/2020 11h:16p:20s
//
//
//        Question 6:
//        In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//        table (giống trong Database)
//
//        Exercise 3: Date Format
//        Question 1:
//        In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//        dạng vietnamese
//
//
//        Question 2:
//        In ra thông tin: Exam đã tạo ngày nào theo định dạng
//        Năm – tháng – ngày – giờ – phút – giây
//
//
//        Question 3:
//        Chỉ in ra năm của create date property trong Question 2
//
//
//        Question 4:
//        Chỉ in ra tháng và năm của create date property trong Question 2
//
//
//        Question 5:
//        Chỉ in ra "MM-DD" của create date trong Question 2
//
//
//        Exercise 4: Random Number
//        Question 1:
//        In ngẫu nhiên ra 1 số nguyên
//
//
//        Question 2:
//        In ngẫu nhiên ra 1 số thực
//
//
//        Question 3:
//        Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn
//
//
//        Question 4:
//        Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12- 1995
//
//
//        Question 5:
//        Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
//
//
//        Question 6:
//        Lấy ngẫu nhiên 1 ngày trong quá khứ.
//
//
//        Question 7:
//        Lấy ngẫu nhiên 1 số có 3 chữ số.
//
//
//        Exercise 5: Input from console
//        Question 1:
//        Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình.
//
//
//                Question 2:
//        Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình.
//
//
//                Question 3:
//        Viết lệnh cho phép người dùng nhập họ và tên.
//
//
//        Question 4:
//        Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ.
//
//
//                Question 5:
//        Viết lệnh cho phép người dùng tạo account (viết thành method)
//        Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//        chương trình sẽ chuyển thành Position.Dev, Position.Test, Position.ScrumMaster, Position.PM.
//
//
//                Question 6:
//        Viết lệnh cho phép người dùng tạo department (viết thành method)
//
//
//        Question 7:
//        Nhập số chẵn từ console
//
//
//        Question 8:
//        Viết chương trình thực hiện theo flow sau:
//        Bước 1:
//        Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
//        Bước 2:
//        Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//        Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//                department
//        Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//        lại" và quay trở lại bước 1
//        Question 9:
//        Viết method cho phép người dùng thêm group vào account theo flow sau:
//        Bước 1: In ra tên các usernames của user cho người dùng xem
//        Bước 2: Yêu cầu người dùng nhập vào username của account
//        Bước 3: In ra tên các group cho người dùng xem
//        Bước 4: Yêu cầu người dùng nhập vào tên của group
//        Bước 5: Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account        vào group đó .
//
//
//                Question 10: Tiếp tục Question 8 và Question 9
//        Bổ sung thêm vào bước 2 của Question 8 như sau:
//        Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
//                account
//        Bổ sung thêm Bước 3 của Question 8 như sau:
//        Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng text để hỏi   người dùng "Bạn có muốn thực hiện chức năng khác không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để kết thúc chương trình).
//
//
//        Question 11: Tiếp tục Question 10
//        Bổ sung thêm vào bước 2 của Question 8 như sau:
//        Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
//        Bước 1: In ra tên các usernames của user cho người dùng xem
//        Bước 2: Yêu cầu người dùng nhập vào username của account
//        Bước 3: Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
//        Bước 4: Thêm account vào group chương trình vừa chọn ngẫu nhiên
//
//
//        Exercise 6: Method
//        Question 1:
//        Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
//
//
//        Question 2:
//        Tạo method để in thông tin các account
//
//
//        Question 3:
//        Tạo method để in ra các số nguyên dương nhỏ hơn 10






    }

}