package ex_2;

import java.util.Scanner;

public class Q10 {
}

class Group{
    private Account[] accounts;
    private String groupName;

    public Group(Account[] accounts, String groupName) {
        this.groupName = ScannerUtils.inputString();
        System.out.println("có muốn thêm account mới không: \n1.có \n 2.không");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        scanner.nextLine();
        if (choose == 1){
            System.out.println("nhập tên acc");
            String name = scanner.nextLine();
            Account account = new Account(name);
            this.accounts =  new Account[]{account};
        }else {
            this.accounts = accounts;
        }
    }

    public static void main(String[] args) {
        Group group = new Group(null, "tesst");
    }
}

class Account{
    private String name;

    public Account() {
    }

    public Account(String name) {
        this.name = name;
    }
}