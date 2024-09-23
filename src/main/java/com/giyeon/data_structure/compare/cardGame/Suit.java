package com.giyeon.data_structure.compare.cardGame;

public enum Suit {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLUB("♣");

    private final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}
