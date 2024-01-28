package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> deck;
    private Random random = new Random();


    public Deck() {
        this.deck = inicializarMazo();
    }


    private List<Card> inicializarMazo() {
        List<Card> deck = new ArrayList<>();
        String[] values = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        Suit[] palos = Suit.values();
        for (int i = 0; i < 13; i++) {
            int value = random.nextInt(13);
            int palo = random.nextInt(4);
            deck.add(new Card(palos[palo],values[value]));
        }
        return deck;
    }

    public void mostrarDeck(){
        for (Card card: deck){
            System.out.println(card.toString());
        }
    }

    public Card shufleCard(){
        int value = random.nextInt(13);
        return deck.get(value);
    }
}

