package ex1_static.q6;

import ex1_static.q1.Student;

public class PrimaryStudent extends Student {
    static int count = 0;
    public PrimaryStudent() {
        super();
        count++;
    }
}
