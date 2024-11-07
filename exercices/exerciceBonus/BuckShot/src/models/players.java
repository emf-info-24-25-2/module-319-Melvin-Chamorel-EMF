package models;

import models.Shotgun;

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
  
    public void damage() {
        HP--;
        if (HP <= 0) {
            dead = true;
        } else if (HP == 1) {
            System.out.println("careful now");
        }
    }

    public void regen() {
        if (HP < MAX_HEALTH) {
            HP++;
            System.out.println("you feel better");
        } else {
            System.out.println("you got... nothing YIPPE");
        }
        
    }
}