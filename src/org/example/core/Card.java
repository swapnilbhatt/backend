package org.example.core;

public class Card {
    final public String suite;
    final public int value;
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
