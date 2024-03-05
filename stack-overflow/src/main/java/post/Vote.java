package main.java.post;

import main.java.account.User;

public class Vote {

    private User user;
    private boolean isUpvote;

    public Vote(boolean isUpvote, User user){
        this.isUpvote = isUpvote;
        this.user = user;
    }
}
