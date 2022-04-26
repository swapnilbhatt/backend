package org.example.core;

public class Card implements ICard {
    public String getSuite() {
        return suite;
    }

    public int getValue() {
        return value;
    }

    final private String suite;
    final private int value;

    public Card(int value, String suite) {
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
