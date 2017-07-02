package com.example.user.weekendhomeworkfruitmachine;

import java.util.ArrayList;

/**
 * Created by user on 01/07/2017.
 */

public class Fruitmachine {
    ArrayList<Wheel> wheels;
    int machineCredit;

    public Fruitmachine(ArrayList<Wheel> wheels, int machineCredit){
        this.wheels = wheels;
        this.machineCredit = machineCredit;
    }

    public ArrayList<Symbol> pullLever(){
        ArrayList<Symbol> symbolsFromWheels = new ArrayList<Symbol>();
        for(Wheel wheel: this.wheels){
            symbolsFromWheels.add(wheel.spinWheel());
        }
        return symbolsFromWheels;
    }

    public int getMachineCredit() {
        return machineCredit;
    }

    public void setMachineCredit(int machineCredit) {
        this.machineCredit = machineCredit;
    }

    public void increaseCredit(int payIn){
        machineCredit += payIn;
    }

    public void decreaseCredit(int payOut){
        machineCredit -= payOut;
    }
}

//https://stackoverflow.com/questions/21696784/how-to-declare-an-arraylist-with-values