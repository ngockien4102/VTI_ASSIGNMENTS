package ex_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5_Q6_Q7_Q8 {
    static void inputAge(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("input age: ");
            int age = 0;
            try {
              age = sc.nextInt();
              if (age < 0){
                  System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
              }
            }catch (InputMismatchException e){
                System.out.println("input number please!");
            }
        }while (true);

    }

    public static void main(String[] args) {
        Q5_Q6_Q7_Q8.inputAge();
        ScannerUtils.inputDouble("sai double");
        ScannerUtils.inputFloat("sai float");
        ScannerUtils.inputString();
        ScannerUtils.inputInt("sai int");
    }
}

class ScannerUtils{
    static Integer inputInt(String errMsg){
        Scanner sc = new Scanner(System.in);
        System.out.println("input int num: ");
        int input = 0;
        try {
            input = sc.nextInt();
            return input;
        }catch (InputMismatchException e){
            System.out.println(errMsg);
        }
        return null;
    }

    static Float inputFloat(String errMsg){
        Scanner sc = new Scanner(System.in);
        System.out.println("input float num: ");
        Float input = 0F;
        try {
            input = sc.nextFloat();
            return input;
        }catch (InputMismatchException e){
            System.out.println(errMsg);
        }
        return null;
    }

    static Double inputDouble(String errMsg){
        Scanner sc = new Scanner(System.in);
        System.out.println("input double num: ");
        Double input = 0D;
        try {
            input = sc.nextDouble();
            return input;
        }catch (InputMismatchException e){
            System.out.println(errMsg);
        }
        return null;
    }

    static String inputString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input string: ");
        String input = sc.nextLine();
        return input;
    }
}

