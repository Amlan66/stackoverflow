package main.java.post;

import main.java.account.User;

import java.util.ArrayList;

public class Question {
    private String title;
    private String description;
    private User user;
    private ArrayList<Answer> answers;
    private ArrayList<Comment> comments;
    private ArrayList<Vote> votes;

    public Question(String title, String description, User user){
        this.title = title;
        this.description = description;
        this.user = user;
        this.answers = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.votes = new ArrayList<>();
    }

    public void addAnswer(Answer answer){
        this.answers.add(answer);
    }

    public void addComment(Comment comment){
        this.comments.add(comment);
    }

    public void addVote(Vote vote){
        this.votes.add(vote);
    }

}
