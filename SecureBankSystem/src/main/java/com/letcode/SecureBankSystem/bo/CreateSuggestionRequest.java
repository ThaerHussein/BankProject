package com.letcode.SecureBankSystem.bo;

public class CreateSuggestionRequest {
    private String suggestionText;
    private double rate;

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

