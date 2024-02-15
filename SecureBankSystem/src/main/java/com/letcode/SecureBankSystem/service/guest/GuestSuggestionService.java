package com.letcode.SecureBankSystem.service.guest;

import com.letcode.SecureBankSystem.bo.CreateSuggestionRequest;
import com.letcode.SecureBankSystem.entity.GuestSuggestionEntity;

import java.util.List;

public interface GuestSuggestionService {

    void processSuggestion(CreateSuggestionRequest suggestionRequest);

    List<GuestSuggestionEntity> findAllRemovedSuggestions();

    List<GuestSuggestionEntity> findAllCreatedSuggestions();
}
