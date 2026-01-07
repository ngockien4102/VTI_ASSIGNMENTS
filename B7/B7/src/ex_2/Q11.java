package ex_2;

import java.util.Scanner;

public class Q11 {

    static void inputAge() throws InvalidAgeInputingException {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 0) {
            throw new InvalidAgeInputingException("The age must be greater than 0");
        } else if (age < 18) {
            System.out.println("Your age must be greater than 18");
        }
    }

    public static void main(String[] args) throws InvalidAgeInputingException {
        try {
            inputAge();
        } catch (InvalidAgeInputingException e) {
            System.out.println(e.getMessage());
        }
    }

}

class InvalidAgeInputingException extends Exception {
    private String msg;

    public InvalidAgeInputingException(String msg) {
        super(msg);
        this.msg = msg;
    }
}