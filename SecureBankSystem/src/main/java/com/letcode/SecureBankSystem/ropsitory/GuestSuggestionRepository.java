package com.letcode.SecureBankSystem.ropsitory;

import com.letcode.SecureBankSystem.entity.GuestSuggestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestSuggestionRepository extends JpaRepository<GuestSuggestionEntity, Long> {
}

