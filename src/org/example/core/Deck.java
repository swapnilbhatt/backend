package org.example.core;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> deck;
    private List<Card> delt;

    final int noOfCards;
    public Deck() {
        deck = new ArrayList<>();
        delt = new ArrayList<>();
        noOfCards = 13;

        for(int i = 1 ; i <= noOfCards ; i++){
            deck.add(new ClubCard(i));
            deck.add(new DiamondCard(i));
            deck.add(new HeartCard(i));
            deck.add(new SpadeCard(i));
        }
    }

    public Card dealCard(){
        int rand = (int)(Math.random() * ((deck.size() - 1)));
        Card c = deck.get(rand);
        deck.remove(c);
        delt.add(c);
        return c;
    }

    public void unDealCard(Card c){
        deck.add(c);
        delt.remove(c);
    }
}
