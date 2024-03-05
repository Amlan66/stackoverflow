package main.java.post;

import main.java.account.User;

import java.util.ArrayList;

public class Answer {

    private String text;
    private User user;
    private ArrayList<Comment> comments;
    private ArrayList<Vote> votes;

    public Answer(String text, User user){
        this.text = text;
        this.user = user;
        this.comments = new ArrayList<>();
        this.votes = new ArrayList<>();
    }

    public void addComment(Comment comment){
        this.comments.add(comment);
    }

    public void addVote(Vote vote){
        this.votes.add(vote);
    }
}
