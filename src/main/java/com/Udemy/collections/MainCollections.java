package com.Udemy.collections;

import java.util.List;

public class MainCollections {

    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);
    }
}
