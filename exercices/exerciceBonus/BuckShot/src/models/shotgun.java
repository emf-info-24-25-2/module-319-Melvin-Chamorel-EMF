package models;

public class Shotgun {
    private int[] magasine;
    private boolean sawed;
    
    public Shotgun() {
        this.magasine =new int[8];
        this.sawed = false;
    }

    public int[] getMagasine() {
        return magasine;
    }

    public boolean isSawed() {
        return sawed;
    }

    public void reload( int MAX_SHELL, int MIN_SHELL) throws InterruptedException {
        int blank = (int) (Math.random() * (MAX_SHELL - MIN_SHELL + 1)) + MIN_SHELL;
        int live = (int) (Math.random() * (MAX_SHELL - MIN_SHELL + 1)) + MIN_SHELL;
        int shells = blank + live;
        graphics.shells.showShell(blank, live);
        System.out.println("there is " + live + " live and " + blank + " blank");
        Thread.sleep(500);
        for (int i = 0; i < shells; i++) {
            int random = (int) (Math.random() * (2 - 1 + 1)) + 1;
            if (random == 1) {
                if (blank > 0) {
                    blank = blank - 1;
                    magasine[i] = 1;
                } else {
                    live = live - 1;
                    magasine[i] = 2;
                }
            }
            if (random == 2) {
                if (live > 0) {
                    live = live - 1;
                    magasine[i] = 2;
                } else {
                    blank = blank - 1;
                    magasine[i] = 1;
                }
            }
        }
        System.out.println("all shells are suffled");
        Thread.sleep(500);
    }

    public void getSawed(){
        sawed = true;
    }
    
}


