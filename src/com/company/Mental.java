package com.company;

public class Mental extends Player {
   private int manTreat;

    public int getManTreat() {
        return manTreat;
    }

    public void setManTreat(int manTreat) {
        this.manTreat = manTreat;
    }

    public Mental(int health, int damage, int manTreat) {
        super(health, damage);
        this.manTreat = manTreat;

    }
}
