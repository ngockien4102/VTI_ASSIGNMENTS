package ex1_Abstraction.Q2;

public class Student {
    private String studentCode;
    private String fullName;
    private String address;
    private String priority;
    private String examBlock;

    public Student(String studentCode, String fullName, String address, String priority, String examBlock) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.address = address;
        this.priority = priority;
        this.examBlock = examBlock;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getExamBlock() {
        return examBlock;
    }

    public void setExamBlock(String examBlock) {
        this.examBlock = examBlock;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", priority='" + priority + '\'' +
                ", examBlock='" + examBlock + '\'' +
                '}';
    }
}
