package org.example.core;

import java.util.List;

public interface IGame {


    IPlayer addPlayer();

    List<IPlayer> addPlayers(int noOfPlayers);
    void removePlayer(IPlayer player);

    List<IPlayer> getPlayers();

    void dealCards();

    void showHands();

    void dealCard(IPlayer p);

    void printWinner();

    int getWinner(List<IPlayer> players);
}
