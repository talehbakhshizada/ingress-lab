package com.example.cards.mapper;

import com.example.cards.util.CardUtil;
import com.example.cards.dao.entity.CardEntity;
import com.example.cards.model.request.CreateCardRequest;

import java.time.LocalDate;
import java.util.Random;

public enum CardMapper {

    CARD_MAPPER;

    public CardEntity mapToCardEntity(CreateCardRequest cardRequest) {
        return CardEntity.builder()
                .holder(cardRequest.getHolderName())
                .expireDate(LocalDate.now().plusYears(cardRequest.getActiveYear()))
                .cvv(String.valueOf(new Random().nextInt(100, 999)))
                .pan(CardUtil.generatePan(cardRequest.getBrand()))
                .build();
    }

}
