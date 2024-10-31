package models;

public class shotgun {
    private int[] magasine;
    private boolean sawed;
    
    public shotgun(int[] magasine, boolean sawed) {
        this.magasine = magasine;
        this.sawed = sawed;
    }

    public int[] getMagasine() {
        return magasine;
    }

    public boolean isSawed() {
        return sawed;
    }

}
