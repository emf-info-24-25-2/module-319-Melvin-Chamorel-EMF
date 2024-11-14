package models;

import java.util.Scanner;

import models.Shotgun;
import app.App;


public class players {
    private final int MAX_HP;
    private int id;
    private String nom;
    private int HP;
    private int[] inventory;
    private boolean blocked;
    private boolean dead;

    public players(int id, String nom, int hP, int[] inventory, boolean blocked, boolean dead) {
        this.id = id;
        this.nom = nom;
        this.MAX_HP = hP;
        this.HP = hP;
        this.inventory = inventory;
        this.blocked = blocked;
        this.dead = dead;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getHP() {
        return HP;
    }

    public int[] getInventory() {
        return inventory;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public boolean isDead() {
        return dead;
    }

    public static Scanner scanner;
  
    public void damage() {
        HP--;
        if (HP <= 0) {
            dead = true;
        } else if (HP == 1) {
            System.out.println("careful now");
        }
    }
    public void bigDamage() {
        HP =- 2;
        if (HP <= 0) {
            dead = true;
        } else if (HP == 1) {
            System.out.println("careful now");
        }
    }

    public void regen() {
        if (HP < MAX_HP) {
            HP++;
            System.out.println("you feel better");
        } else {
            System.out.println("you got... nothing YIPPE");
        }
        
    }
    public void giveItems() throws InterruptedException {
        Thread.sleep(500);
        for (int i = 0; i < 3; i++) {
            int itemRandom = (int) (Math.random() * (9 - 1 + 1)) + 1;
            switch (itemRandom) {
                case 1:
                    System.out.println("+ 1 Vodka shot");
                    Thread.sleep(500);
                    break;

                case 2:
                    System.out.println("+ 1 Magnifying glass");
                    Thread.sleep(500);
                    break;

                case 3:
                    System.out.println("+ 1 Cigarette");
                    Thread.sleep(500);
                    break;

                case 4:
                    System.out.println("+ 1 Saw");
                    Thread.sleep(500);
                    break;
                case 5:
                    System.out.println("+ 1 Cellphone");
                    Thread.sleep(500);
                    break;
                case 6:
                    System.out.println("+ 1 Adrenaline shot");
                    Thread.sleep(500);
                    break;
                case 7:
                    System.out.println("+ 1 Handcuffs");
                    Thread.sleep(500);
                    break;
                case 8:
                    System.out.println("+ 1 Inverter");
                    Thread.sleep(500);
                    break;
                case 9:
                    System.out.println("+ 1 Expired Drugs");
                    Thread.sleep(500);
                    break;
            }
            for (int j = 0; j < inventory.length; j++) {
                if (inventory[j] == 0) {
                    inventory[j] = itemRandom;
                    break;
                }
            }
        }
    }
    public void useItems() {
        System.out.println("here are your items");
        for (int i = 0; i < inventory.length; i++) {
            System.out.print(i + ": ");
            switch (inventory[i]) {
                case 1:
                    System.out.println("Vodka shot");
                    break;
                case 2:
                    System.out.println("Magnifying glass");
                    break;
                case 3:
                    System.out.println("Cigarette");
                    break;
                case 4:
                    System.out.println("Saw");
                    break;
                case 5:
                    System.out.println("Cellphone");
                    break;
                case 6:
                    System.out.println("Adrenaline shot");
                    break;
                case 7:
                    System.out.println("Handcuffs");
                    break;
                case 8:
                    System.out.println("Inverter");
                    break;
                case 9:
                    System.out.println("Expired Drugs");
                    break;
                default:
                System.out.println("Empty");
                    break;
            }
        }
        System.out.println("what do you want to use ?");
        System.out.println("10 to leave, 11 for item's info");
        int choice = scanner.nextInt();
        if (choice == 10) {
            System.out.println("take your time");
        } else if (choice == 11) {
            System.out.println("1: the shot of vodka, you can drink it to reload the shotgun witout shooting");
            System.out.println("2");
        }
        int useItem = inventory[choice];
        switch (useItem) {
            case 1:
                useVodka();
                break;
            case 2:
                useGlass();
                break;
            case 3:
                useCigarette();
                break;
            case 4:
                useSaw();
                break;
            case 5:
                usePhone();
                break;
            case 6:
                useAdrenaline();
                break;
            case 7:
                useCuffs();
                break;
            case 8:
                useInverter();
                break;
            case 9:
                useDrugs();
                break;
            case 10:
                //App.useReverse();
                break;
        }
    }

    public void useVodka(){

    }

    public void useGlass(){

    }

    public void useCigarette(){

    }

    public void useSaw(){  
    }

    public void usePhone(){

    }

    public void useAdrenaline(){

    }

    public void useCuffs(){

    }

    public void useInverter(){

    }

    public void useDrugs(){

    }

}