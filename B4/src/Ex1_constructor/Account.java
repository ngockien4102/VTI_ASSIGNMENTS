package Ex1_constructor;

import java.time.LocalDate;

public class Account {
    private int id;
    private String email;
    private String userName;
    private String firstName;
    private String lastName;
    private String fullName;
    private LocalDate createDate;
    private int positionId;

    public Account(){
    }

    public Account(int id, String email, String userName, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;
    }

    public Account(int id, String email, String userName, String firstName, String lastName , int positionId) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;
        this.positionId = positionId;
        this.createDate = LocalDate.now();
    }

    public Account(int id, String email, String userName, String firstName, String lastName, LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;
        this.createDate = createDate;
    }
}
