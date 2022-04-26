package org.example.core;

import java.util.List;

public interface IGame {


    Player addPlayer();

    List<Player> addPlayers(int noOfPlayers);
    void removePlayer(Player player);

    public List<Player> getPlayers();

    void dealCards();

    void showHands();

    void dealCard(Player p);

    void printWinner();

    int getWinner(List<Player> players);
}
