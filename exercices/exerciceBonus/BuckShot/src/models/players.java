package models;
public class players {
    private String nom;
    private int HP;
    private int[] inventory;
    private boolean blocked;

    public players(int hP, int[] inventory, boolean blocked) {
        this.nom = nom;
        this.HP = hP;
        this.inventory = inventory;
        this.blocked = blocked;
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
    
    
}