package org.example.core;

public enum Suite {
     HEARTS("H"),
     SPADE("S"),
     CLUBS("C"),
     DIAMONDS("D");

    private String suit;

    public String getSuit() {
        return suit;
    }

    Suite(String suit) {
        this.suit = suit;
    }
}

