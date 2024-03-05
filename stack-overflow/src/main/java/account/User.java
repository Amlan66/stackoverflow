package main.java.account;

import main.java.post.Answer;
import main.java.post.Comment;
import main.java.post.Question;
import main.java.post.Vote;

public class User {

    private String username;
    public User(String username){
        this.username = username;
    }

    public Question postQuestion(String title, String description){
        return new Question(title, description, this);
    }

    public Answer postAnswer(Question question, String text){
        Answer answer = new Answer(text, this);
        question.addAnswer(answer);
        return answer;
    }

    public Comment postComment(Question question, String text){
        Comment comment = new Comment(text, this);
        question.addComment(comment);
        return comment;
    }

    public Comment postComment(Answer answer, String text){
        Comment comment = new Comment(text, this);
        answer.addComment(comment);
        return comment;
    }

    public Vote postVote(Question question, boolean isUpvote){
        Vote vote = new Vote(isUpvote, this);
        question.addVote(vote);
        return vote;
    }

    public Vote postVote(Answer answer, boolean isUpvote){
        Vote vote = new Vote(isUpvote, this);
        answer.addVote(vote);
        return vote;
    }

}
