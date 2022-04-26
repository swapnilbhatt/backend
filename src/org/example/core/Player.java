package org.example.core;

import java.util.ArrayList;
import java.util.List;

public class Player implements IPlayer {
    public List<ICard> getHand() {
        return new ArrayList<>(hand);
    }

    private List<ICard> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    @Override
    public void addCardToHand(ICard card){
        this.hand.add(card);
    }

    @Override
    public void showHand() {
        System.out.println(hand);
    }
}
