package ex1_Abstraction.Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Question 1: Interface
//        Tạo một interface có tên INews bao gồm method void Display(), float Calculate().
//                Tạo một class News bao gồm thuộc tính:
//        ID (int), Title (String), PublishDate (String), Author (String),
//                Content (String) và AverageRate (float).
//        Tạo các setter và getter cho từng thuộc tính, riêng AverageRate thì chỉ có getter.
//                Implement các method trong interface INews như sau:
//        a) Method Display() sẽ in ra Title, PublishDate, Author,Content và AverageRate của tin tức ra console.
//                b) Method có tên Calculate() để thiết đặt thuộc tính
//        Khai báo một array có tên Rates kiểu int gồm 3 phần tử AverageRate là trung bình cộng của 3 phần tử của array Rates.
//                c) Tạo chương trình demo có tên là MyNews và tạo một menu lựa chọn gồm các mục sau:
//                 ∙ Insert news
//                 ∙ View list news
//                 ∙ Average rate
//                 ∙ Exit
//        Nếu người dùng chọn 1 từ bàn phím thì tạo một object của class News và nhập giá trị cho các thuộc tính Title, PublishDate, Author, Content sau đó yêu cầu người dùng nhập vào 3 đánh giá để lưu vào Rates.
//        Nếu người dùng chọn 2 từ bàn phím thì thực thi method Display().
//                Nếu người dùng chọn 3 từ bàn phím thì thực hiện method Calculate() để tính đánh giá trung bình, sau đó thực thi method Display().
//                Trường hợp người dùng chọn 4 thì sẽ thoát khỏi chương trình.
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        List<News> newsList = new ArrayList<>();
        do {
            System.out.print("1. Insert news \n 2. View list news \n 3.Average rate \n 4.Exit \n");
            choose = sc.nextInt();
            sc.nextLine();
            int id = 0;
            switch (choose) {
                case 1:
                    System.out.println("title");
                    String title = sc.nextLine();
                    System.out.println("publishDate");
                    String publishDate = sc.nextLine();
                    System.out.println("author");
                    String author = sc.nextLine();
                    System.out.println("content");
                    String content = sc.nextLine();
                    System.out.println("3 đánh giá");
                    float rate1 = sc.nextFloat();
                    float rate2 = sc.nextFloat();
                    float rate3 = sc.nextFloat();

                    float[] averageRate = {rate1, rate2, rate3};

                    News news = new News(id++, title, publishDate, author, content, averageRate);
                    newsList.add(news);
                    System.out.println();
                    break;
                case 2:
                    for (News obj : newsList) {
                        obj.display();
                    }
                    System.out.println();
                    break;
                case 3:
                    for (News obj : newsList) {
                        System.out.println("averageRate " + obj.getTitle() + ": " + obj.calculate());
                        System.out.println();
                    }
                    break;
                case 4:
                    return;
            }

        } while (choose != 4);
    }
}
