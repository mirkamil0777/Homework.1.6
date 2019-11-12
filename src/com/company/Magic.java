package com.company;

public class Magic extends Player {
    private String attackType;

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public Magic(int health, int damage, String attackType) {
        super(health, damage);
        this.attackType = attackType;


    }
}
