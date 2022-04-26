package org.example.core;

import java.util.ArrayList;
import java.util.List;

public class Deck implements IDeck {
    private List<ICard> deck;

    final int noOfCards;
    public Deck() {
        deck = new ArrayList<>();
        noOfCards = 13;

        for(int i = 1 ; i <= noOfCards ; i++){
            deck.add(new ClubCard(i));
            deck.add(new DiamondCard(i));
            deck.add(new HeartCard(i));
            deck.add(new SpadeCard(i));
        }
    }

    @Override
    public ICard dealCard(){
        int rand = (int)(Math.random() * ((deck.size() - 1)));
        ICard c = deck.get(rand);
        deck.remove(c);
        return c;
    }

    @Override
    public void unDealCard(ICard c){
        deck.add(c);
    }
}
