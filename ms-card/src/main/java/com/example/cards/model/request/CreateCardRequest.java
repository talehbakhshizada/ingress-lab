package com.example.cards.model.request;

import com.example.cards.model.enums.CardBrand;
import com.example.cards.model.enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = PRIVATE)
public class CreateCardRequest {

    String holderName;
    CardType type;
    CardBrand brand;
    Integer activeYear;

}
