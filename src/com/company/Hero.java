package com.company;

public class Hero {
    private int health;
    private int damage;
    private String heroSuperPower;
    private String nameOfHero;

    public Hero(int health, int damage, String heroSuperPower, String nameOfHero) {
        this.health = health;
        this.damage = damage;
        this.heroSuperPower = heroSuperPower;
        this.nameOfHero = nameOfHero;
    }
    public Hero(int health, int damage, String nameOfHero) {
        this.health = health;
        this.damage = damage;
        this.nameOfHero = nameOfHero;


    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getHeroSuperPower() {
        return heroSuperPower;
    }

    public String getNameOfHero() {
        return nameOfHero;
    }





}


