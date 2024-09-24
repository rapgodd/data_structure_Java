package com.giyeon.data_structure.compare.cardGame;

import java.util.List;

public class Player {

    private String name;
    private List<Card> hand;

    public Player(String name, List<Card> hand) {
        this.name = name;
        this.hand = hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public int rankSum() {
        int value = 0;
        for (Card card : hand) {
            value += card.getNum();
        }
        return value;
    }

    public void showHand() {
        hand.sort(null);
        System.out.println(name);
    }

    public String getName() {
        return name;
    }


}
