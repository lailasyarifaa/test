package modul5.Tugas5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====== Player 1 ======");
        System.out.println("Assasin");
        System.out.println("Level: "); int level = input.nextInt();
        Assasin assasin = new Assasin(level, "Gun", "fire");
        System.out.println("Attack: " + assasin.attackDamage);
        System.out.println("Defense: " + assasin.defense);
        System.out.println("Health: " + assasin.healthPoint);
        System.out.println("Life Status: " + assasin.lifeStatus);
        Gun gun = new Gun("Swordmaster");
        gun.useWeaponable();
        Fire fire = new Fire("Fire");
        fire.useElement();
        gun.weaponDamage();
        fire.weaponDamage();
        fire.totalDamage(gun);

        System.out.println("\n====== Player 2 ======");
        System.out.println("Tank");
        System.out.println("Level: "); int tingkat = input.nextInt();
        Tank tank = new Tank(tingkat);
        System.out.println("Attack: " + tank.attackDamage);
        System.out.println("Defense: " + tank.defense);
        System.out.println("Health: " + tank.healthPoint);
        System.out.println("Life Status: " + tank.lifeStatus);
        tank.spawnIntro();
        Earth earth = new Earth("Earth");
        earth.useElement();
        Armor armor = new Armor("Armor");
        System.out.println("Armor defense: " + armor.defensePoint);
        System.out.println("Element defense: " + armor.additionalPoint);

        System.out.println("\n====== FIGHT BEGIN ======\n");
        for (int i = 1; i <= 11; i++){
            System.out.println("====== Round " + i + " ======");

            //player 1 turn
            System.out.println("====== Player 1 turn ======");
            assasin.spawnIntro();
            assasin.attack(tank);
            
            System.out.println("Player 2 HP: " + tank.healthPoint);
            System.out.println("Player 2 Armor: " + tank.armorStrenght);

            if (!tank.lifeStatus){
                System.out.println("\nPlayer 2 is dead");
                System.out.println("Player 1 WIN!!");
                break;
            }

            //Player 2 turn
            System.out.println("====== Player 2 turn ======");
            tank.spawnIntro();
            tank.attack(tank);
            System.out.println("Player 2 HP: " + assasin.healthPoint);

            if (!assasin.lifeStatus){
                System.out.println("\nPlayer 1 is dead");
                System.out.println("Player 2 WIN!!");
                break;
            }
        }
    }
}
