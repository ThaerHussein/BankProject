package com.letcode.SecureBankSystem.service.guest;

import com.letcode.SecureBankSystem.bo.CreateSuggestionRequest;
import com.letcode.SecureBankSystem.entity.GuestSuggestionEntity;
import com.letcode.SecureBankSystem.ropsitory.GuestSuggestionRepository;
import com.letcode.SecureBankSystem.service.functionalinterface.SuggestionProcessor;
import org.springframework.stereotype.Service;

@Service
public class GuestSuggestionServiceImpl implements GuestSuggestionService{
    private final GuestSuggestionRepository guestSuggestionRepository;

    public GuestSuggestionServiceImpl(GuestSuggestionRepository guestSuggestionRepository) {
        this.guestSuggestionRepository = guestSuggestionRepository;
    }

    public void processSuggestion(CreateSuggestionRequest suggestionRequest) {
        SuggestionProcessor processor = suggestionText -> {
            GuestSuggestionEntity suggestionEntity = new GuestSuggestionEntity();
            suggestionEntity.setSuggestionText(suggestionRequest.getSuggestionText());
            suggestionEntity.setRate(suggestionRequest.getRate());
            guestSuggestionRepository.save(suggestionEntity);
        };

        processor.process(suggestionRequest.getSuggestionText());
    }
}
