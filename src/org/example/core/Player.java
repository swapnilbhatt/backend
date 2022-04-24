package org.example.core;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public List<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void showHand() {
        System.out.println(hand);
    }
}
