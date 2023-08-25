package com.example.cards.util;

import com.example.cards.model.enums.CardBrand;

import java.util.Random;

import static com.example.cards.model.enums.CardBrand.MASTERCARD;
import static com.example.cards.model.enums.CardBrand.VISA;

public final class CardUtil {

    private static final int PAN_LENGTH = 16;

    public static String generatePan(CardBrand cardBrand) {
        var random = new Random();
        var panBuilder = new StringBuilder();

        if (cardBrand == VISA) {
            panBuilder.append(4);
        } else if (cardBrand == MASTERCARD) {
            panBuilder.append(5);
        } else {
            throw new IllegalArgumentException("Unsupported card brand");
        }

        for (int i = 1; i < PAN_LENGTH; i++) {
            panBuilder.append(random.nextInt(10));
        }

        return panBuilder.toString();
    }

    private CardUtil() {
    }

}
