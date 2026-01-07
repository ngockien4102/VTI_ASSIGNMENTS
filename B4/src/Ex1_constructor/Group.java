package Ex1_constructor;

import java.time.LocalDate;

public class Group {
    private String groupName;
    private Account creator;
    private Account[] accounts;
    private LocalDate createDate;

    private String[] usernames;

    public Group(String groupName, Account creator, Account[] accounts, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    public Group(String groupName, Account creator, LocalDate createDate, String[] usernames) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        this.usernames = usernames;
    }

}
