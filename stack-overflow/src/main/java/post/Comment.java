package main.java.post;

import main.java.account.User;

public class Comment {

    private User user;
    private String text;

    public Comment(String text, User user) {
        this.text = text;
        this.user = user;
    }
}
