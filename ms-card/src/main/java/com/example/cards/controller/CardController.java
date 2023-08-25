package com.example.cards.controller;

import com.example.cards.model.request.CreateCardRequest;
import com.example.cards.service.CardService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cards")
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class CardController {

    CardService cardService;

    @PostMapping
    public void createCard(@RequestBody CreateCardRequest cardRequest) {
        cardService.createCard(cardRequest);
    }

}
