package org.example.core;

import java.util.ArrayList;
import java.util.List;

public class Game implements AutoCloseable {
    List<Player> players;
    private static Game instance;
    private Deck deck;
    private Game() {
        deck = new Deck();
        players = new ArrayList<>();
    }

    public Player addPlayer(){
        Player player = new Player();
        players.add(player);
        return player;
    }

    public void removePlayer(Player player){
        for(Card c: player.hand){
            deck.unDealCard(c);
        }

        players.remove(player);
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Cleaning up instance");
        instance = null;
    }

    public void dealCards(int noOfCards) {
        for(Player player : players){
            int cnt = 0;
            while(cnt<noOfCards){
                dealCard(player);
                cnt++;
            }
        }
    }

    public void showHands() {
        for (Player player : players) {
            player.showHand();
        }
    }
    public void dealCard(Player p) {
        p.hand.add(deck.dealCard());
    }

    public void printWinner() {
        int winner = getWinner(players);

        if (winner > 0)
            System.out.println(String.format("Player %d wins", winner));
        else
            System.out.println("It's a tie");
    }

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
