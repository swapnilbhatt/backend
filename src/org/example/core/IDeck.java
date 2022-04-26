package org.example.core;

public interface IDeck {
    ICard dealCard();

    void unDealCard(ICard c);
}
