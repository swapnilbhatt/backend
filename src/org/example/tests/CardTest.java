package org.example.tests;

import org.example.core.Card;
import org.example.core.SpadeCard;
import org.example.core.Suite;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @org.junit.jupiter.api.Test
    void getSuite() {
        Card c= new SpadeCard(4);
        Assertions.assertEquals(c.getSuite(), Suite.SPADE.getSuit());
    }

    @org.junit.jupiter.api.Test
    void getValue() {
        Card c= new SpadeCard(4);
        assertEquals(c.getValue(), 4);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Card c= new SpadeCard(4);
        assertEquals(c.toString(), "Card{suite='SPADE', value=4}");
    }
}