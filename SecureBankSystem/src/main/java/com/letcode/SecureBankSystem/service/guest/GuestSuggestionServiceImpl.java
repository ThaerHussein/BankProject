package com.letcode.SecureBankSystem.service.guest;

import com.letcode.SecureBankSystem.bo.CreateSuggestionRequest;
import com.letcode.SecureBankSystem.entity.GuestSuggestionEntity;
import com.letcode.SecureBankSystem.ropsitory.GuestSuggestionRepository;
import com.letcode.SecureBankSystem.service.functionalinterface.SuggestionProcessor;
import com.letcode.SecureBankSystem.util.enums.SuggestionStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestSuggestionServiceImpl implements GuestSuggestionService{
    private final GuestSuggestionRepository guestSuggestionRepository;

    public GuestSuggestionServiceImpl(GuestSuggestionRepository guestSuggestionRepository) {
        this.guestSuggestionRepository = guestSuggestionRepository;
    }

    @Override
    public void processSuggestion(CreateSuggestionRequest suggestionRequest) {
        SuggestionProcessor processor = suggestionText -> {
            GuestSuggestionEntity suggestionEntity = new GuestSuggestionEntity();
            suggestionEntity.setSuggestionText(suggestionRequest.getSuggestionText());
            suggestionEntity.setRate(suggestionRequest.getRate());
            guestSuggestionRepository.save(suggestionEntity);
        };

        processor.process(suggestionRequest.getSuggestionText());
    }

    @Override
    public List<GuestSuggestionEntity> findAllCreatedSuggestions() {
        return guestSuggestionRepository.findByStatus(SuggestionStatus.CREATE);
    }

    @Override
    public List<GuestSuggestionEntity> findAllRemovedSuggestions() {
        return guestSuggestionRepository.findByStatus(SuggestionStatus.REMOVE);
    }
}
