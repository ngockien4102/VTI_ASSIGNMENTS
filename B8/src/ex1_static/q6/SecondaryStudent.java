package ex1_static.q6;

import ex1_static.q1.Student;

public class SecondaryStudent extends Student {
    static int count = 0;

    public SecondaryStudent() {
        super();
        count++;
    }
}
