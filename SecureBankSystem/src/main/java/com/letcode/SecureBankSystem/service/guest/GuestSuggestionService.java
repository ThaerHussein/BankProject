package com.letcode.SecureBankSystem.service.guest;

import com.letcode.SecureBankSystem.bo.CreateSuggestionRequest;

public interface GuestSuggestionService {

    void processSuggestion(CreateSuggestionRequest suggestionRequest);
}
