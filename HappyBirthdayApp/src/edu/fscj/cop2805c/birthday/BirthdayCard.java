// BirthdayCard.java
// D. Singletary
// 2/15/23
// Class which represents a birthday card

package edu.fscj.cop2805c.birthday;

public class BirthdayCard {

    // test with odd length (comment to test with even length, below)
    public static final String WISHES = "Hope all of your birthday wishes come true!";
    // uncomment to test with even length
    //final String WISHES = "Hope all of your birthday wishes come true!x";

    User user;
    private String message;

    public BirthdayCard(User user, String message) {
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }
}
