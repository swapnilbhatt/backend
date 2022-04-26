package org.example.core;

import java.util.List;

public interface IPlayer {
    void showHand();
    List<ICard> getHand();
    void addCardToHand(ICard card);
}
