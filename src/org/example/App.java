package org.example;

import org.example.core.Game;
import org.example.core.GameFactory;
import org.example.core.IGame;
import org.example.core.Player;

public class App {
    public static void main(String[] args) {
        IGame game = GameFactory.createNewGame();
        Player p1 = game.addPlayer();
        Player p2 = game.addPlayer();
        Player p3 = game.addPlayer();
        Player p4 = game.addPlayer();

        game.dealCards( 5);
        game.showHands();

        game.printWinner();
    }
}
