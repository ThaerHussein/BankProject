package com.letcode.SecureBankSystem.service.functionalinterface;

@FunctionalInterface // also you can write the interface without this function because any interface with one method is a functional interface
public interface SuggestionProcessor {
    void process(String suggestionText);
}

