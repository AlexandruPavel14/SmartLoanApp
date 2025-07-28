package com.alexandrupavel.smartloanappapi.model.bank;

import com.alexandrupavel.smartloanappapi.model.user.User;
import jakarta.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int score;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Rating() {}

    public Rating(Long id, int score, String comment, User user) {
        this.id = id;
        this.score = score;
        this.comment = comment;
        this.user = user;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }

    public String getComment() { return comment; }

    public void setComment(String comment) { this.comment = comment; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }
}
