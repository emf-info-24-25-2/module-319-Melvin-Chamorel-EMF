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
    

    public players(int id, String nom, int hP, boolean blocked, boolean dead) {
        this.id = id;
        this.nom = nom;
        this.MAX_HP = hP;
        this.HP = hP;
        this.inventory = new int[8];
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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setHP(int hP) {
        HP = hP;
    }

    public void setId(int Id) {
        id = Id;
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

    public void bigRegen(){
        if (HP < MAX_HP) {
            HP++;
            if (HP < MAX_HP) {
                HP++;
                System.out.println("+2HP");
            } else {
                System.out.println("+1HP");
                
            }
        } else {
            System.out.println("you got... nothing YIPPE");
            
        }
    }

    public void giveItems() throws InterruptedException {
        Thread.sleep(500);
        System.out.println(nom + " is getting his items:");
        for (int i = 0; i < 3; i++) {
            int itemRandom = (int) (Math.random() * (9 - 1 + 1)) + 1;
            switch (itemRandom) {
                case 1:
                    System.out.println("+ 1 Beer can");
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
                    System.out.println("+ 1 Expired Meds");
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
    public void useItems(Shotgun shotgun) {
        System.out.println("here are your items");
        for (int i = 0; i < inventory.length; i++) {
            System.out.print(i + 1 + ": ");
            switch (inventory[i]) {
                case 1:
                    System.out.println("Beer can");
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
                    System.out.println("Expired Medicine");
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
            System.out.println("1: the Beer can, you can drink it to reload the shotgun witout shooting");
            System.out.println("2: the Magnifying glass, you can see the chambered shell");
            System.out.println("3: the Cigarette, you can smoke it to regen 1 HP");
            System.out.println("4: the Saw, you can saw the barrel off to deal extra damage");
            System.out.println("5: the Cellphone, it will give you the info on a random shell");
            System.out.println("6: the Adrenaline shot, you can steal an item");
            System.out.println("7: the Handcuffs, make the oponent skip there turn");
            System.out.println("8: the Inverter, swap all the live shell for blank and the other way around");
            System.out.println("9: the Expired Medicine, 50% chance to gain 2HP and 50% chance to lose 1HP");
        } else {
            int useItem = inventory[choice];
            switch (useItem) {
                case 1:
                    useBeer(shotgun);
                    break;
                case 2:
                    useGlass(shotgun);
                    break;
                case 3:
                    useCigarette();
                    break;
                case 4:
                    useSaw(shotgun);
                    break;
                case 5:
                    usePhone(shotgun);
                    break;
                case 6:
                    useAdrenaline();
                    break;
                case 7:
                    useCuffs();
                    break;
                case 8:
                    useInverter(shotgun);
                    break;
                case 9:
                    useMeds();
                    break;
            }
        }
        
    }

    public void useBeer(Shotgun shotgun){

    }

    public void useGlass(Shotgun shotgun){

    }

    public void useCigarette(){
        regen();
    }

    public void useSaw(Shotgun shotgun){
        shotgun.getSawed();
    }

    public void usePhone(Shotgun shotgun){
        shotgun.getInfo();
    }

    public void useAdrenaline(){

    }

    public void useCuffs(){

    }

    public void useInverter(Shotgun shotgun){

    }

    public void useMeds(){
        System.out.println("you eat a pill");
        int random = (int) (Math.random() * (2 - 1 + 1)) + 1;
        if (random == 1) {
            damage();
            System.out.println("");
        } else {
            bigRegen();
        }
    }

    public void aiUseItems(){
    
    }

}

