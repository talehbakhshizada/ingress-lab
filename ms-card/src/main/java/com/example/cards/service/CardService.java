package com.example.cards.service;

import com.example.cards.dao.repository.CardRepository;
import com.example.cards.model.request.CreateCardRequest;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import static com.example.cards.mapper.CardMapper.CARD_MAPPER;
import static lombok.AccessLevel.PRIVATE;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class CardService {

    CardRepository cardRepository;

    public void createCard(CreateCardRequest createCardRequest) {
        cardRepository.save(CARD_MAPPER.mapToCardEntity(createCardRequest));
    }

}
