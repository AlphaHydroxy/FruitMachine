package com.example.user.weekendhomeworkfruitmachine;


/**
 * Created by user on 30/06/2017.
 */

public class Player {

    int credit;

    public Player(int credit){
        this.credit = credit;
    }


    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void buyGame(int payForGame){
        credit -= payForGame;
    }
}