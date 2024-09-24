package com.giyeon.data_structure.compare.cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck(List<Card> cards) {
        for (int i = 0; i < 13; i++) {
            cards.add(new Card(i, Suit.SPADE));
            cards.add(new Card(i, Suit.HEART));
            cards.add(new Card(i, Suit.CLUB));
            cards.add(new Card(i, Suit.DIAMOND));
        }
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(0);
    }


}
