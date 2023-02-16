// User.java
// D. Singletary
// 2/15/23
// Class which represents a user

package edu.fscj.cop2805c.birthday;

import java.time.ZonedDateTime;

public class User {
    private StringBuilder name;
    private String email;
    private ZonedDateTime birthday;

    public User(String fName, String lName, String email, ZonedDateTime birthday) {
        this.name = new StringBuilder();
        this.name.append(fName).append(" ").append(lName);
        this.email = email;
        this.birthday = birthday;
    }

    public StringBuilder getName() {
        return name;
    }

    public String getEmail() { return email; }

    public ZonedDateTime getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        String s = this.name + "," + this.birthday;
        return s;
    }
}
