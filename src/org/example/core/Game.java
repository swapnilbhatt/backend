package org.example.core;

import java.util.ArrayList;
import java.util.List;

public class Game implements AutoCloseable, IGame {
    private List<Player> players;
    private static Game instance;
    private Deck deck;

    final int NO_OF_CARDS = 5;
//    static Game getInstance() {
//        if (Game.instance == null) {
//            Game.instance = new Game();
//        }
//        return Game.instance;
//    }


    Game() {
        deck = new Deck();
        players = new ArrayList<>();
    }

    Game(int noOfPlayers) throws InvalidPlayerCountException {
        if (noOfPlayers < 0 || noOfPlayers > 10)
            throw new InvalidPlayerCountException("Invalid player counts");

        deck = new Deck();
        players = new ArrayList<>();
        players = addPlayers(noOfPlayers);
    }

    @Override
    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public Player addPlayer() {
        Player player = new Player();
        players.add(player);
        return player;
    }

    @Override
    public List<Player> addPlayers(int playerCnt) {
        List<Player> players = new ArrayList<>();

        for (int i = 0; i < playerCnt; i++) {
            players.add(addPlayer());
        }

        return players;
    }

    @Override
    public void removePlayer(Player player) {
        for (Card c : player.hand) {
            deck.unDealCard(c);
        }

        players.remove(player);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Cleaning up instance");
        instance = null;
    }

    @Override
    public void dealCards() {
        for (Player player : players) {
            int cnt = 0;
            while (cnt < NO_OF_CARDS) {
                dealCard(player);
                cnt++;
            }
        }
    }

    @Override
    public void showHands() {
        for (Player player : players) {
            player.showHand();
        }
    }

    @Override
    public void dealCard(Player p) {
        p.hand.add(deck.dealCard());
    }

    @Override
    public void printWinner() {
        int winner = getWinner(players);

        if (winner > 0)
            System.out.println(String.format("Player %d wins", winner));
        else
            System.out.println("It's a tie");
    }

    @Override
    public int getWinner(List<Player> players) {
        int winner = -1;
        int maxCard = -1;

        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);

            for (int j = 0; j < player.hand.size(); j++) {
                Card card = player.hand.get(j);

                if (card.value > maxCard) {
                    winner = i;
                    maxCard = card.value;
                }
            }
        }

        return winner + 1;
    }
}
