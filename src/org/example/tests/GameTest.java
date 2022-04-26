package org.example.tests;

import org.example.core.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    static IGame g;

    @BeforeAll
    public static void init() throws InvalidPlayerCountException {
         g = new Game(5);
    }

    @Test
    void getPlayers() throws InvalidPlayerCountException {
        assertEquals(g.getPlayers().size(), 5);
    }

    @Test
    void dealCards() {
        g.dealCards();
        List<IPlayer> players = g.getPlayers();

        for(IPlayer p : players){
            assertEquals(p.getHand().size(), 5);
        }
    }

    @Test
    void showHands() {
    }

    @Test
    void dealCard() {
    }

    @Test
    void getWinner() {
        List<IPlayer> players = g.getPlayers();
        int winner = -1;
        int maxCard = -1;

        for (int i = 0; i < players.size(); i++) {
            IPlayer player = players.get(i);

            for (int j = 0; j < player.getHand().size(); j++) {
                List<ICard> hand = player.getHand();
                ICard card = hand.get(j);

                if (card.getValue() > maxCard) {
                    winner = i;
                    maxCard = card.getValue();
                }
            }
        }

        assertEquals(winner+1, g.getWinner(players));
    }
}