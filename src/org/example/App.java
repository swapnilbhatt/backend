package org.example;

import org.example.core.Game;
import org.example.core.Player;

public class App {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        Player p1 = game.addPlayer();
        Player p2 = game.addPlayer();

        game.dealCards( 5);
        game.showHands();

        game.printWinner();
    }
}
