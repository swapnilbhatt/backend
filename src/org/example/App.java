package org.example;

import org.example.core.Game;
import org.example.core.Player;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        Player p1 = game.addPlayer();
        Player p2 = game.addPlayer();

        game.dealCards(p1, 5);
        game.dealCards(p2, 5);

        p1.showHand();
        p2.showHand();
        game.printWinner();
    }
}
