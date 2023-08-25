package com.example.cards.dao.repository;

import com.example.cards.dao.entity.CardEntity;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<CardEntity, Long> {
}
