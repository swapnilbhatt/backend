package org.example.core;

import java.util.List;

public interface IGame {
    List<IPlayer> getPlayers();

    void dealCards();

    void showHands();

    void dealCard(IPlayer p);

    void printWinner();

    int getWinner(List<IPlayer> players);
}
