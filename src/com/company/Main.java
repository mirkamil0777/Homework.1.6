package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Warrior w = new Warrior(200,20,40);
        w.applyAbility();
        Magic m = new Magic(200,20,"40");
        m.applyAbility();
        Mental m1 = new Mental(200,20,10);
        m1.applyAbility();
    }
}
