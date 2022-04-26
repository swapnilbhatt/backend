package org.example.core;

public class GameFactory {
    public static IGame createNewGame(GameType type, int noOfPlayers) throws InvalidPlayerCountException {
        IGame game;

        if(type == GameType.DemoGame){
            game = new Game(noOfPlayers);
        }else{
            game = new Game(noOfPlayers);
        }

        return game;
    }
}
