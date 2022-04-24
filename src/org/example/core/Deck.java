package org.example.core;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public List<Card> deck;
    public List<Card> delt;

    public Deck() {
        deck = new ArrayList<Card>();
        delt = new ArrayList<Card>();

        for(int i = 1 ; i <= 13 ; i++){
            deck.add(new Card(i,Suite.CLUBS));
            deck.add(new Card(i,Suite.DIAMONDS));
            deck.add(new Card(i,Suite.HEARTS));
            deck.add(new Card(i,Suite.SPADE));
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
