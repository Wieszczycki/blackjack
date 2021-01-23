package com.kodilla.blackjack;

import java.util.Arrays;
import java.util.Collections;

public final class Suit {
    private String name;
    private String symbol;

    public final static Suit CLUBS = new Suit( "Clubs", "C" );
    public final static Suit DIAMONDS = new Suit( "Diamonds", "D" );
    public final static Suit HEARTS = new Suit( "Hearts", "H" );
    public final static Suit SPADES = new Suit( "Spades", "S" );

    public final static java.util.List VALUES =
            Collections.unmodifiableList(
                    Arrays.asList( new Suit[] { CLUBS, DIAMONDS, HEARTS, SPADES } ) );

    private Suit( String nameValue, String symbolValue ) {
        name = nameValue;
        symbol = symbolValue;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return name;
    }
}