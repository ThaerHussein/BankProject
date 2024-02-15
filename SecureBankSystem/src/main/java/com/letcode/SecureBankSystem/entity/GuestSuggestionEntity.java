package com.letcode.SecureBankSystem.entity;

import com.letcode.SecureBankSystem.util.enums.SuggestionStatus;

import javax.persistence.*;

@Entity
@Table(name = "guest_suggestions")
public class GuestSuggestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String suggestionText;

    @Column(nullable = false)
    private double rate;

    @Enumerated(EnumType.STRING)
    private SuggestionStatus status;

    public SuggestionStatus getStatus() {
        return status;
    }

    public void setStatus(SuggestionStatus status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSuggestionText() {
        return suggestionText;
    }

    public void setSuggestionText(String suggestionText) {
        this.suggestionText = suggestionText;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
