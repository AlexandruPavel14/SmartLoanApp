package com.alexandrupavel.smartloanappapi.dto.bank;

public class RatingDTO {

    private Long id;
    private int score;
    private String comment;
    private Long userId;

    // Getters & Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }

    public String getComment() { return comment; }

    public void setComment(String comment) { this.comment = comment; }

    public Long getUserId() { return userId; }

    public void setUserId(Long userId) { this.userId = userId; }
}
