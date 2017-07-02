package com.example.user.weekendhomeworkfruitmachine;

/**
 * Created by user on 01/07/2017.
 */

public enum Symbol {

    CHERRY(1),
    AUBERGINE(2),
    LEMON(3),
    BAR(4),
    SEVEN(5),
    BELL(6),
    DIAMOND(7),
    HORSESHOE(8),
    BANANA(9);

    public int symbol;

    Symbol(int symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return this.symbol;

    }

}
