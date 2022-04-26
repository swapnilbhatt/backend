package org.example.core;

public class Card implements ICard {
    public String getSuite() {
        return suite.getSuit();
    }

    public int getValue() {
        return value;
    }

    final private Suite suite;
    final private int value;

    public Card(int value, Suite suite) {
        this.suite = suite;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suite='" + suite + '\'' +
                ", value=" + value +
                '}';
    }
}
