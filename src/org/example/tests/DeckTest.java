package org.example.tests;

import org.example.core.Deck;
import org.example.core.ICard;
import org.example.core.IDeck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    @Test
    void dealCard() {
        IDeck d = new Deck();
        ICard first = d.dealCard();
        ICard second = d.dealCard();

        assertNotEquals(first.toString(), second.toString());
    }
}