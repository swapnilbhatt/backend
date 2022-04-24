package org.example.core;

public class GameFactory {
    public static IGame createNewGame(){
        IGame game = Game.getInstance();
        return game;
    }
}
