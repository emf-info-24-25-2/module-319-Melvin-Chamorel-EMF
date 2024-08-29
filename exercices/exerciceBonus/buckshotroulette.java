package exercices.exerciceBonus;

public class buckshotroulette {
    public static final int MAX_SHELL = 4;
    public static final int MIN_SHELL = 1;
    public static final int MAX_HEALTH = 3;
    public static void main(String[] args) {
        int[] shotgun = new int [8];
        int[] aiInventory = new int [8];
        int[] playerInventory = new int [8];
        int playerHealth = 3;
        int aiHealth = 3;
        boolean empty = ture;
        boolean playerTurn = true;
        while (true) {
            for (int i = 0; i < shotgun.length; i++) {
                if (shotgun[i] > 0) {
                    empty = true;
                }else {
                    empty = false;
                    break;
                }
            }
            if (empty = true) {
                System.out.println("the gun is empty");
                reload(shotgun, MAX_SHELL, MIN_SHELL);
                    giveItemsAi(aiInventory);
                    giveItemsPlayer(playerInventory);
            }
        }
        
        
        show(playerInventory, aiInventory, playerHealth, aiHealth);

    }
    
    public static int[] reload(int[] shotgun, int MAX_SHELL, int MIN_SHELL) {
        int blank = (int) (Math.random() * (MAX_SHELL - MIN_SHELL + 1)) + MIN_SHELL;
        int live = (int) (Math.random() * (MAX_SHELL - MIN_SHELL + 1)) + MIN_SHELL;
        int shells = blank + live;
        System.out.println("there is " + live + " live and " + blank + " blank");
        for (int i = 0; i < shells; i++) {
            int random = (int) (Math.random() * (2 - 1 + 1)) + 1;
            if (random == 1) {
                if (blank > 0) {
                    blank = blank - 1;
                    shotgun [i] = 1;
                } else {
                    live = live - 1;
                    shotgun [i] = 2;
                }
            }
            if (random == 2) {
                if (live > 0) {
                    live = live - 1;
                    shotgun [i] = 2;
                } else {
                    blank = blank - 1;
                    shotgun [i] = 1;
                }
            }
        }
        System.out.println("all shells are suffled");
        return shotgun;
    }

    public static int[] giveItemsAi(int[] aiInventory) {
        System.out.println("ai is geting his items");
        for (int i = 0; i < 3; i++) {
            int itemRandom = (int) (Math.random() * (4 - 1 + 1)) + 1;
            switch (itemRandom) {
                case 1:
                System.out.println("+ 1 beer"); 
                    break;
            
                case 2:
                System.out.println("+ 1 magnifying glass"); 
                    break;

                case 3:
                System.out.println(" + 1 cigarette");
                    break;

                case 4:
                System.out.println(" + 1 saw");
                    break;
                
                    
            }
           for (int j = 0; j < aiInventory.length; j++) {
            if (aiInventory[j] == 0) {
                aiInventory[j] = itemRandom;
                break;
            }
           }
        }
        return aiInventory; 
        }
        public static int[] giveItemsPlayer(int[] playerInventory) {
            System.out.println("player is geting his items");
            for (int i = 0; i < 3; i++) {
                int itemRandom = (int) (Math.random() * (4 - 1 + 1)) + 1;
                switch (itemRandom) {
                    case 1:
                    System.out.println("+ 1 beer"); 
                        break;
                
                    case 2:
                    System.out.println("+ 1 magnifying glass"); 
                        break;
    
                    case 3:
                    System.out.println(" + 1 cigarette");
                        break;
    
                    case 4:
                    System.out.println(" + 1 saw");
                        break;
                }

               for (int j = 0; j < playerInventory.length; j++) {
                if (playerInventory[j] == 0) {
                    playerInventory[j] = itemRandom;
                    break;
                }
            }
            
            
        }
        return playerInventory; 
    }
    public static void show(int[] playerInventory, int[] aiInventory, int playerHealth, int aiHealth) {
        System.out.println("+--------+-----------------------+--------+--------+");
        switch (aiHealth) {
            case 0:
                System.out.println("|        |        |              |        |        |");
                break;
            case 1:
                System.out.println("|        |        |      ♡       |        |        |");
                break;
            case 2:
                System.out.println("|        |        |    ♡   ♡    |        |        |");
                break;
            case 3:
                System.out.println("|        |        |    ♡ ♡ ♡     |        |        |");
                break;
        }
        System.out.println("|    " + aiInventory[0] + "   |    " + aiInventory[1] + "   |              |    " + aiInventory[2] + "   |    " + aiInventory[3] + "   |");
        System.out.println("|        |        |              |        |        |");
        System.out.println("+--------+--------+              +--------+--------+");
        System.out.println("|        |        |              |        |        |");
        System.out.println("|    " + aiInventory[4] + "   |    " + aiInventory[5] + "   |              |    " + aiInventory[6] + "   |    " + aiInventory[7] + "   |");
        System.out.println("|        |        |              |        |        |");
        System.out.println("+--------+--------+              +--------+--------+");
        for (int i = 0; i < 10; i++) {
            System.out.println("|                                                  |");
        }
        System.out.println("+--------+--------+              +--------+--------+");
        System.out.println("|        |        |              |        |        |");
        System.out.println("|    " + playerInventory[0] + "   |    " + playerInventory[1] + "   |              |    " + playerInventory[2] + "   |    " + playerInventory[3] + "   |");
        System.out.println("|        |        |              |        |        |");
        System.out.println("+--------+--------+              +--------+--------+");
        System.out.println("|        |        |              |        |        |");
        System.out.println("|    " + playerInventory[4] + "   |    " + playerInventory[5] + "   |              |    " + playerInventory[6] + "   |    " + playerInventory[7] + "   |");
        switch (playerHealth) {
            case 0:
                System.out.println("|        |        |              |        |        |");
                break;
            case 1:
                System.out.println("|        |        |      ♡       |        |        |");
                break;
            case 2:
                System.out.println("|        |        |    ♡   ♡    |        |        |");
                break;
            case 3:
                System.out.println("|        |        |    ♡ ♡ ♡     |        |        |");
                break;
        }
        System.out.println("+--------+-----------------------+--------+--------+");  

    }

    
}

