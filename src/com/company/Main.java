package com.company;

public class Main {
    public static int counter = 1;


    public static void main(String[] args) {

        Boss bigBoss = new Boss();
        bigBoss.setHealth(700);
        bigBoss.setDamage(150);
        bigBoss.setBossDefenceType("Magical");
        System.out.println(bigBoss.getHealth() + " " + bigBoss.getDamage() + " " + bigBoss.getBossDefenceType());
        for (Hero temp : createHeroes()) {
            System.out.println(counter + ") HERO: ");
            System.out.println("     Name: " + temp.getNameOfHero());
            System.out.println("     Damage: " + temp.getDamage());
            if (temp.getHeroSuperPower() == null) {
                System.out.println("   no Superpower!");
            } else {
                System.out.println("   Superpower: " + temp.getHeroSuperPower());
            }
            System.out.println("_______________");
            counter++;
        }
    }


       /*Hero createsHero1 = new Hero(400, 50, "Physical", "Thor");
        System.out.println(createsHero1.getHealth() + " " + createsHero1.getDamage() + " " +
                createsHero1.getHeroSuperPower() + " " + createsHero1.getNameOfHero());

        Hero createsHero2 = new Hero(300, 60, "Firing", "Iron man");
        System.out.println(createsHero2.getHealth() + " " + createsHero2.getDamage() + " " +
                createsHero2.getHeroSuperPower() + " " + createsHero2.getNameOfHero());
        Hero createsHero3 = new Hero(200, 70, "Magical", "Doctor Strange");
        System.out.println(createsHero3.getHealth() + " " + createsHero3.getDamage() + " " +
                createsHero3.getHeroSuperPower() + " " + createsHero3.getNameOfHero());
       */


    public static Hero[] createHeroes() {
        Hero thor = new Hero(400, 50, "Physical", "Thor");
        Hero ironMan = new Hero(300, 60, "Firing", "Iron Man");
        Hero doctorStrange = new Hero(200, 70, "Magical", "Doctor Strange");
        return new Hero[]{thor, ironMan, doctorStrange};

    }


}
