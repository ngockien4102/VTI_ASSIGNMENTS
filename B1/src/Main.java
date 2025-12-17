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


        System.out.println("Department: " + department1.departmentName);
        System.out.println("Position: " + position1.positionName);
        System.out.println("Account: " + account1.userName);
        System.out.println("Group: " + group1.groupName);
        System.out.println("GroupAccount: " + groupAccount1.group.groupId);
        System.out.println("TypeQuestion: " + typeQuestion1.typeName);
        System.out.println("CategoryQuestion: " + categoryQuestion1.categoryName);
        System.out.println("Question: " + question1.questionId);
        System.out.println("Answer: " + answer1.content);
        System.out.println("Exam: " + exam1.code);
        System.out.println("ExamQuestion: " + examQuestion1.examId);
    }
}