package com.letcode.SecureBankSystem.controller.guest;

import com.letcode.SecureBankSystem.bo.CreateSuggestionRequest;
import com.letcode.SecureBankSystem.service.guest.GuestSuggestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/guest")
public class GuestController {

    private final GuestSuggestionService guestSuggestionService;

    public GuestController(GuestSuggestionService guestSuggestionService) {
        this.guestSuggestionService = guestSuggestionService;
    }

    @PostMapping("/create-suggest")
    public ResponseEntity<String> createSuggestion(@RequestBody CreateSuggestionRequest createSuggestionRequest) {
        guestSuggestionService.processSuggestion(createSuggestionRequest);
        return ResponseEntity.ok("Suggestion created successfully");
    }
}
