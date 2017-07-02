package com.example.user.weekendhomeworkfruitmachine;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 01/07/2017.
 */

public class Wheel {
    ArrayList<Symbol> symbols;

    public Wheel() {
        symbols = new ArrayList<Symbol>();
        populateSymbols();
    }

    public Symbol spinWheel() {
        Random randomSymbol = new Random();
        int index = randomSymbol.nextInt(numOfSymbols());
        return getSymbol(index);
    }

    public Symbol getSymbol(int index) {
        return this.symbols.get(index);
    }

    public int numOfSymbols() {
        return this.symbols.size();
    }

    private void populateSymbols() {
        for (Symbol symbol : Symbol.values()) {
            this.symbols.add(symbol);
        }
    }
}

//https://stackoverflow.com/questions/5034370/retrieving-a-random-item-from-arraylist

