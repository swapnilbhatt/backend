package org.example.core;

import java.util.ArrayList;
import java.util.List;

public class Game implements IGame {
    private List<IPlayer> players;
    private IDeck deck;

    final int NO_OF_CARDS = 5;

    public Game(int noOfPlayers) throws InvalidPlayerCountException {
        if (noOfPlayers < 0 || noOfPlayers > 10)
            throw new InvalidPlayerCountException("Invalid player counts");

        deck = new Deck();
        players = new ArrayList<>();
        players = addPlayers(noOfPlayers);
    }

    @Override
    public List<IPlayer> getPlayers() {
        return players;
    }

    private IPlayer addPlayer() {
        IPlayer player = new Player();
        players.add(player);
        return player;
    }

    private List<IPlayer> addPlayers(int playerCnt) {
        List<IPlayer> players = new ArrayList<>();

        for (int i = 0; i < playerCnt; i++) {
            players.add(addPlayer());
        }

        return players;
    }

    private void removePlayer(IPlayer player) {
        for (ICard c : player.getHand()) {
            deck.unDealCard(c);
        }

        players.remove(player);
    }

    @Override
    public void dealCards() {
        for (IPlayer player : players) {
            int cnt = 0;
            while (cnt < NO_OF_CARDS) {
                dealCard(player);
                cnt++;
            }
        }
    }

    @Override
    public void showHands() {
        for (IPlayer player : players) {
            player.showHand();
        }
    }

    @Override
    public void dealCard(IPlayer p) {
        p.addCardToHand(deck.dealCard());
    }

    @Override
    public void printWinner() {
        int winner = getWinner(players);

        if (winner > 0)
            System.out.printf("Player %d wins%n", winner);
        else
            System.out.println("It's a tie");
    }

    @Override
    public int getWinner(List<IPlayer> players) {
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

        return winner + 1;
    }
}
