package com.kodilla.blackjack;

import javafx.scene.image.Image;

public class Card {
    private Suit suitValue;
    private Rank rankValue;
    private Image cardImage;

    public Card( Suit suit, Rank rank, Image cardFace ) {
        cardImage = cardFace;
        suitValue = suit;
        rankValue = rank;
    }

    public static String getFilename( Suit suit, Rank rank ) {
        return "file:src/main/resources/"+rank.getSymbol() + suit.getSymbol() + ".png";
    }

    public Suit getSuit() {
        return suitValue;
    }

    public Rank getRank() {
        return rankValue;
    }

    public int getValue() {
        String rank = rankValue.getSymbol();
        try{
            // try to turn it into an integer
            return Integer.parseInt(rank);
        } catch (Exception ex){

            // we failed, so it is a letter
            if(rank.equals("A")){
                // it is an ace
                return 11;
            } else {
                // it is a face card
                return 10;
            }
        }
    }

    public Image getCardImage() {
        return cardImage;
    }

    @Override
    public String toString() {
        return rankValue.toString() + " of " + suitValue.toString();
    }

    public String rankToString() {
        return rankValue.toString();
    }

    public String suitToString() {
        return suitValue.toString();
    }
}
