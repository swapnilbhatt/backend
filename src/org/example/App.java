package org.example;

import org.example.core.*;

public class App {
    public static void main(String[] args) {
        try {
            IGame game = GameFactory.createNewGame(GameType.DemoGame, 5);
            game.dealCards();
            game.showHands();
            game.printWinner();
        } catch (InvalidPlayerCountException ex) {
            System.out.println("Please enter valid player nos. Player no should be between 0 and 10");
        }
    }
}
