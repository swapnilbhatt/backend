package org.example.core;

import java.util.List;

public interface IGame {


    Player addPlayer();

    void removePlayer(Player player);

    void dealCards(int noOfCards);

    void showHands();

    void dealCard(Player p);

    void printWinner();

    int getWinner(List<Player> players);
}
