package org.example;

public class Card {
    private Suit suit;
    private String value;

    public Card(Suit suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return suit+value;
    }

    public int winner(Card card) {
        String order = "23456789TJQKA";
        return order.indexOf(this.value) - order.indexOf(card.value);
    }
}
