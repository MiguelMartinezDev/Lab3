package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Card Computer = deck.shufleCard();
        Card Player = deck.shufleCard();
        System.out.println("Computer: " + Computer.toString());
        System.out.println("Player: " + Player.toString());

        int winner = Player.winner(Computer);
        if (winner > 0){
            System.out.println("Ganaste");
        }else if(winner < 0){
            System.out.println("Perdiste");
        }else{
            System.out.println("Empate");
        }
    }

}