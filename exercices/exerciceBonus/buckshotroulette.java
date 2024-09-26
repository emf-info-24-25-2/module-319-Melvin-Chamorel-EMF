package exercices.exerciceBonus;

import java.util.Scanner;

public class buckshotroulette {
    public static final int MAX_SHELL = 4;
    public static final int MIN_SHELL = 1;
    public static final int MAX_HEALTH = 4;
    public static Scanner scanner;
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    // set the finals ints
    public static void main(String[] args) throws InterruptedException {
        int[] shotgun = new int[8];
        int[] aiInventory = new int[8];
        int[] playerInventory = new int[8];
        int playerHealth = MAX_HEALTH;
        int aiHealth = MAX_HEALTH;
        boolean empty = true;
        boolean playerTurn = false;
        boolean game = true;
        boolean playing = true;
        boolean self = true;
        boolean player = true;
        boolean sawed = false;
        scanner = new Scanner(System.in);
        int anger = 0;
        
        // set all the variables in the code
        while (game == true) {
        for (int i = 0; i < shotgun.length; i++) {
            if (shotgun[i] == 0) {
                empty = true;
            } else {
                empty = false;
                break;
            }
        }
            if (empty == true) {
                System.out.println("the shotgun is empty");
                Thread.sleep(500);
                reload(shotgun, MAX_SHELL, MIN_SHELL);
                giveItemsAi(aiInventory);
                giveItemsPlayer(playerInventory);
                show(playerInventory, aiInventory, playerHealth, aiHealth);
                playerTurn = true;

            }
            // check if the shotgun is loaded or no if no reload and gives items to both

            if (playerTurn == true) {
                
                while (playing == true) {
                    System.out.println("it's your turn,");
                    Thread.sleep(500);
                    System.out.println("1: shoot yourself");
                    Thread.sleep(500);
                    System.out.println("2: shoot ennemy");
                    Thread.sleep(500);
                    System.out.println("3: use item");
                    Thread.sleep(500);
                    System.out.println("4: show HP");

                    int chois = scanner.nextInt();
                    switch (chois) {
                        case 1:
                            self = true;
                            player = true;
                            shoot(shotgun, playerHealth, aiHealth, self, player, sawed, playerTurn, playing);
                            break;
                        case 2:
                            self = false;
                            player = true;
                            shoot(shotgun, playerHealth, aiHealth, self, player, sawed, playerTurn, playing);
                            break;
                        case 3:
                            player = true;
                            useItems(aiInventory, playerInventory, sawed, player, shotgun, playerHealth, aiHealth);
                            show(playerInventory, aiInventory, playerHealth, aiHealth);
                            break;
                        case 4:
                            showHP(playerHealth, aiHealth);
                            break;
                        default:

                            switch (anger) {
                                case 0:
                                    System.out.println("what are you doing ?");
                                    anger = 1;
                                    break;
                                case 1:
                                    System.out.println("euu are you ok?");
                                    anger = 2;
                                    break;
                                case 2:
                                    System.out.println("is there somthing wrong?");
                                    anger = 4;
                                    break;
                                default:
                                    System.out.println("GET OUT!!!");
                                    playerHealth = 0;
                                    playing = false;
                                    playerTurn = false;
                                    break;
                            }

                            break;
                    }
                }

            } else {
                System.out.println("my turn now");
                int aiChoice = (int) (Math.random() * (3 - 1 + 1)) + 1;
                switch (aiChoice) {
                    case 1:
                        self = true;
                        player = false;
                        shoot(shotgun, playerHealth, aiHealth, self, player, sawed, playerTurn, playing);
                        break;
                    case 2:
                        self = false;
                        player = false;
                        shoot(shotgun, playerHealth, aiHealth, self, player, sawed, playerTurn, playing);
                        break;
                    case 3:
                        player = false;
                        useItems(aiInventory, playerInventory, sawed, player, shotgun, playerHealth, aiHealth);
                        break;
            }

            }
            scanner.close();
        }
    }
        

    

    public static int[] reload(int[] shotgun, int MAX_SHELL, int MIN_SHELL) throws InterruptedException {
        int blank = (int) (Math.random() * (MAX_SHELL - MIN_SHELL + 1)) + MIN_SHELL;
        int live = (int) (Math.random() * (MAX_SHELL - MIN_SHELL + 1)) + MIN_SHELL;
        int shells = blank + live;
        showShell(blank, live);
        System.out.println("there is " + live + " live and " + blank + " blank");
        Thread.sleep(500);
        for (int i = 0; i < shells; i++) {
            int random = (int) (Math.random() * (2 - 1 + 1)) + 1;
            if (random == 1) {
                if (blank > 0) {
                    blank = blank - 1;
                    shotgun[i] = 1;
                } else {
                    live = live - 1;
                    shotgun[i] = 2;
                }
            }
            if (random == 2) {
                if (live > 0) {
                    live = live - 1;
                    shotgun[i] = 2;
                } else {
                    blank = blank - 1;
                    shotgun[i] = 1;
                }
            }
        }
        System.out.println("all shells are suffled");
        Thread.sleep(500);
        return shotgun;
    }
    // reload and randomize in a random amount and order

    public static int[] giveItemsAi(int[] aiInventory) throws InterruptedException {
        System.out.println("ai is geting his items");
        Thread.sleep(500);
        for (int i = 0; i < 3; i++) {
            int itemRandom = (int) (Math.random() * (4 - 1 + 1)) + 1;
            switch (itemRandom) {
                case 1:
                    System.out.println("+ 1 beer");
                    Thread.sleep(500);
                    break;

                case 2:
                    System.out.println("+ 1 magnifying glass");
                    Thread.sleep(500);
                    break;

                case 3:
                    System.out.println("+ 1 cigarette");
                    Thread.sleep(500);
                    break;

                case 4:
                    System.out.println("+ 1 saw");
                    Thread.sleep(500);
                    break;
                    case 5:
                    System.out.println("+ 1 cellphone");
                    Thread.sleep(500);
                    break;
                case 6:
                    System.out.println("+ 1 adrenaline");
                    Thread.sleep(500);
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
    // gives the ai random item

    public static int[] giveItemsPlayer(int[] playerInventory) throws InterruptedException {
        System.out.println("player is geting his items");
        Thread.sleep(500);
        for (int i = 0; i < 3; i++) {
            int itemRandom = (int) (Math.random() * (6 - 1 + 1)) + 1;
            switch (itemRandom) {
                case 1:
                    System.out.println("+ 1 beer");
                    Thread.sleep(500);
                    break;

                case 2:
                    System.out.println("+ 1 magnifying glass");
                    Thread.sleep(500);
                    break;

                case 3:
                    System.out.println("+ 1 cigarette");
                    Thread.sleep(500);
                    break;

                case 4:
                    System.out.println("+ 1 saw");
                    Thread.sleep(500);
                    break;
                case 5:
                    System.out.println("+ 1 cellphone");
                    Thread.sleep(500);
                    break;
                case 6:
                    System.out.println("+ 1 adrenaline");
                    Thread.sleep(500);
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
    // gives player randoms items

    public static void shoot(int[] shotgun, int playerHealth, int aiHealth, boolean self, boolean player, boolean sawed,boolean playerTurn, boolean playing) throws InterruptedException {
        for (int i = 0; i < shotgun.length; i++) {
            if (shotgun[i] > 0) {
                if (player == true) {
                    if (self == true) {
                        if (shotgun[i] == 1) {
                            System.out.print("click.");
                            Thread.sleep(1000);
                            System.out.println(" It's a blank");
                            Thread.sleep(500);
                        } else {
                            System.out.println("BOOM!!!");
                            if (sawed == true) {
                                playerHealth -= 2;
                            } else {
                                playerHealth--;
                            }
                            playerTurn = false;
                        }
                    } else {
                        if (shotgun[i] == 1) {
                            System.out.print("click.");
                            Thread.sleep(1000);
                            System.out.println(" It's a blank");
                            Thread.sleep(500);
                            playerTurn = false;
                        } else {
                            System.out.println("BOOM!!!");
                            if (sawed == true) {
                                aiHealth -= 2;
                            } else {
                                aiHealth--;
                            }
                            playerTurn = false;
                        }
                    }
                } else {
                    if (self == true) {
                        if (shotgun[i] == 1) {
                            System.out.print("click.");
                            Thread.sleep(1000);
                            System.out.println(" It's a blank");
                            Thread.sleep(500);
                            playerTurn = false;
                        } else {
                            System.out.println("BOOM!!!");
                            if (sawed == true) {
                                aiHealth -= 2;
                            } else {
                                aiHealth--;
                            }
                            playerTurn = true;
                        }
                    } else {
                        if (shotgun[i] == 1) {
                            System.out.print("click.");
                            Thread.sleep(1000);
                            System.out.println(" It's a blank");
                            Thread.sleep(500);
                            playerTurn = true;
                        } else {
                            System.out.println("BOOM!!!");
                            if (sawed == true) {
                                playerHealth -= 2;
                            } else {
                                playerHealth--;
                            }
                            playerTurn = true;
                        }
                    }

                }
                shotgun[i] = 0;
                playing = false;
                break;
            }
        }
        
    }

    public static void useItems(int[] aiInventory, int[] playerInventory, boolean sawed, boolean player,int[] shotgun,int playerHealth, int aiHealth) throws InterruptedException {
        
        if (player == true) {
            System.out.println("what do you whant to use ?");
            for (int i = 0; i < playerInventory.length; i++) {
                switch (playerInventory[i]) {
                    case 1:
                        System.out.println(i + 1 + ": beer");
                        Thread.sleep(500);
                        break;
                    case 2:
                        System.out.println(i + 1 + ": magnifying glass");
                        Thread.sleep(500);
                        break;
                    case 3:
                        System.out.println(i + 1 + ": cigarette");
                        Thread.sleep(500);
                        break;
                    case 4:
                        System.out.println(i + 1 + ": saw");
                        Thread.sleep(500);
                        break;
                    case 5:
                        System.out.println(i + 1 + ": cellphone");
                        Thread.sleep(500);
                        break;
                    case 6:
                        System.out.println(i + 1 + ": adrenaline");
                    default:
                        System.out.println(i + 1 + ": empty");
                        Thread.sleep(500);
                        break;
                }
            }

                int chois = scanner.nextInt();
                switch (playerInventory[chois - 1]) {
                    case 1:
                    System.out.println("you open the can of beer and drink it");
                    Thread.sleep(2000);
                    System.out.println("BURP !!");
                    Thread.sleep(500);
                    System.out.println("you take the shotgun and unload the chambered shell");
                    Thread.sleep(500);
                    for (int i = 0; i < shotgun.length; i++) {
                        if (shotgun[i]>0) {
                            if (shotgun[i] == 1) {
                                
                                System.out.println("a blank got out");
                                Thread.sleep(500);
                            } else {
                                System.out.println("a live got out");
                                Thread.sleep(500);
                            }
                            shotgun[i] = 0;
                            break;
                            
                        }
                    }
                    playerInventory[chois - 1] = 0;
                        break;
                    case 2:
                    System.out.println("you take the magnifing glass and smash it on the table");
                    Thread.sleep(500);
                    System.out.println("wille the dealer is distracted you open the chamber to see what's the next shell");
                    Thread.sleep(500);
                    for (int i = 0; i < shotgun.length; i++) {
                        if (shotgun[i]>0) {
                            if (shotgun[i] == 1) {
                                System.out.println("it's a blank");
                                Thread.sleep(1000);
                            } else {
                                System.out.println("its a live");
                                Thread.sleep(1000);
                            }
                            break;
                        }
                    }
                    playerInventory[chois - 1] = 0;
                        break;
                    case 3:
                    if (playerHealth < MAX_HEALTH) {
                        System.out.println("you smoke a cigarette, the pain in decresing");
                        Thread.sleep(500);
                        System.out.println("+1 HP");
                        Thread.sleep(1000);
                        playerHealth++;
                        playerInventory[chois - 1] = 0;
                    } else {
                        System.out.println("you are already at max health");
                    }
                        break;
                    case 4:
                    System.out.println("you take the saw and saw the barel off");
                    Thread.sleep(500);
                    System.out.println("damage 2x (it's gona hurt)");
                    Thread.sleep(1000);
                    sawed = true;
                    playerInventory[chois - 1] = 0;
                        break;
                    case 5:
                    System.out.println("you take the cellphone, a misterious voice say");
                    int voiceMind = 0;
                    for (int i = 0; i < shotgun.length; i++) {
                        if (shotgun[i] > 0) {
                            voiceMind++;
                        }
                    }
                    if (voiceMind == 1) {
                        System.out.println("womp womp");
                        Thread.sleep(1000);
                    } else {
                    int voiceTalk = (int) (Math.random() * (voiceMind - 2 + 1)) + 2;
                    if (shotgun[voiceTalk] == 1) {
                        System.out.println("number " + voiceTalk + " is a blank");
                        Thread.sleep(1000);
                    } else {
                        System.out.println("number " + voiceTalk + " is a live");
                        Thread.sleep(1000);
                    }
                }

                    break;
                    case 6:
                    int andrenalineKick = 0;
                    for (int i = 0; i < aiInventory.length; i++) {
                        if (aiInventory[i]>0) {
                            andrenalineKick++;
                        }
                    }
                    if (andrenalineKick>0) {
                        System.out.print("you sting yourself.");
                        System.out.println(" you see a flash and you take one of the dealer's item");
                        int adrenalineKickBack = (int) (Math.random() * (andrenalineKick - 1 + 1)) + 1;
                        for (int i = 0; i < aiInventory.length;i++) {
                            if (aiInventory[i]>0) {
                                if (adrenalineKickBack == 0) {
                                    playerInventory[chois - 1] = aiInventory[i];
                                    aiInventory[i] = 0;
                                } else {
                                    adrenalineKickBack--;
                                }
                            }
                        }
                    }
                    
                    break;
                    default:
                    System.out.println("you grab air and trow it at the dealer");
                    Thread.sleep(500);
                    System.out.println("it's useless");
                    Thread.sleep(1000);
                        break;
                }
            
        } else {
            for (int i = 0; i < aiInventory.length; i++) {
                if (aiInventory[i] > 0) {
                    switch (aiInventory[i]) {
                        case 1:
                        System.out.println("he drink the a can of beer the trow the can beind him");
                        Thread.sleep(2000);
                        System.out.println("well well well");
                        Thread.sleep(500);
                        System.out.println("he take the shotgun and unload the chambered shell");
                        Thread.sleep(500);
                        for (int y = 0; y < shotgun.length; y++) {
                            if (shotgun[y]>0) {
                                if (shotgun[y] == 1) {
                                    
                                    System.out.println("a blank got out");
                                    Thread.sleep(500);
                                } else {
                                    System.out.println("a live got out");
                                    Thread.sleep(500);
                                }
                                shotgun[y] = 0;
                                break;
                            }
                        }  
                            break;
                        case 2:
                        System.out.println("he take the magnifing glass and smash it on the table");
                    Thread.sleep(500);
                    System.out.println("then trows it at you so you hide behind the table, when you got up he was looking in the shotgun");
                    Thread.sleep(500);
                    System.out.println("'intresting'");
                    Thread.sleep(1000);
                        break;
                        case 3:
                        if (aiHealth < MAX_HEALTH) {
                            System.out.println("he smoke a cigarette, you can see a smile on his face");        
                            Thread.sleep(1000);
                            aiHealth++;
                            
                        } else {
                            System.out.println("blud just smoked it");
                            Thread.sleep(1000);
                        }
                        break;
                        case 4:
                        System.out.println("he take the saw and saw the barel off");
                    Thread.sleep(500);
                    System.out.println("damage 2x (careful)");
                    Thread.sleep(1000);
                    sawed = true;
                    playerInventory[i] = 0;
                        break;
                        case 5:
                        System.out.println("he take the phone...");
                        Thread.sleep(500);
                        System.out.println("and he trows it");
                        Thread.sleep(1000);
                        break;
                    }
                    aiInventory[i] = 0;
                }
            }
        }
    }



    public static void show(int[] playerInventory, int[] aiInventory, int playerHealth, int aiHealth)
            throws InterruptedException {
        System.out.println("+--------+-----------------------+--------+--------+");
        Thread.sleep(100);
                System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("|    " + aiInventory[0] + "   |    " + aiInventory[1] + "   |              |    "
                + aiInventory[2] + "   |    " + aiInventory[3] + "   |");
        Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("+--------+--------+              +--------+--------+");
        Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("|    " + aiInventory[4] + "   |    " + aiInventory[5] + "   |              |    "
                + aiInventory[6] + "   |    " + aiInventory[7] + "   |");
        Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("+--------+--------+              +--------+--------+");
        Thread.sleep(100);
        for (int i = 0; i < 10; i++) {
            System.out.println("|                                                  |");
            Thread.sleep(100);
        }
        System.out.println("+--------+--------+              +--------+--------+");
        Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("|    " + playerInventory[0] + "   |    " + playerInventory[1] + "   |              |    "
                + playerInventory[2] + "   |    " + playerInventory[3] + "   |");
        Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("+--------+--------+              +--------+--------+");
        Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("|    " + playerInventory[4] + "   |    " + playerInventory[5] + "   |              |    "
                + playerInventory[6] + "   |    " + playerInventory[7] + "   |");
        Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("+--------+-----------------------+--------+--------+");
        Thread.sleep(100);
    }
    // show the table to the player
    public static void showHP(int playerHealth, int aiHealth) throws InterruptedException {
        System.out.println("+--------------------------------------------+---------------------------------------------+");
        Thread.sleep(100);
        System.out.println("|                                            |                                             |");
        Thread.sleep(100);
        System.out.println("| Dealer                                     | Player                                      |");
        Thread.sleep(100);
        System.out.println("+--------------------------------------------+---------------------------------------------+");
        Thread.sleep(100);
        switch (aiHealth) {
            case 1:
            System.out.print("|    /                                       ");
            break;
            case 2:
            System.out.print("|    /          /                            ");
            break;
            case 3:
            System.out.print("|    /          /          /                 ");
            break;
            case 4:
            System.out.print("|    /          /          /          /      ");
        }
        Thread.sleep(100);
        switch (playerHealth) {
            case 1:
            System.out.println("|    /                                        |");
            break;
            case 2:
            System.out.println("|    /          /                             |");
            break;
            case 3:
            System.out.println("|    /          /          /                  |");
            break;
            case 4:
            System.out.println("|    /          /          /          /       |");
        }
        Thread.sleep(100);
        switch (aiHealth) {
            case 1:
            System.out.print("|   /                                        ");
            break;
            case 2:
            System.out.print("|   /          /                             ");
            break;
            case 3:
            System.out.print("|   /          /          /                  ");
            break;
            case 4:
            System.out.print("|   /          /          /          /       ");
        }
        Thread.sleep(100);
        switch (playerHealth) {
            case 1:
            System.out.println("|   /                                         |");
            break;
            case 2:
            System.out.println("|   /          /                              |");
            break;
            case 3:
            System.out.println("|   /          /          /                   |");
            break;
            case 4:
            System.out.println("|   /          /          /          /        |");
        }
        Thread.sleep(100);
        switch (aiHealth) {
            case 1:
            System.out.print("|  /                                         ");
            break;
            case 2:
            System.out.print("|  /          /                              ");
            break;
            case 3:
            System.out.print("|  /          /          /                   ");
            break;
            case 4:
            System.out.print("|  /          /          /          /        ");
        }
        Thread.sleep(100);
        switch (playerHealth) {
            case 1:
            System.out.println("|  /                                          |");
            break;
            case 2:
            System.out.println("|  /          /                               |");
            break;
            case 3:
            System.out.println("|  /          /          /                    |");
            break;
            case 4:
            System.out.println("|  /          /          /          /         |");
        }
        Thread.sleep(100);
        switch (aiHealth) {
            case 1:
            System.out.print("| /                                          ");
            break;
            case 2:
            System.out.print("| /          /                               ");
            break;
            case 3:
            System.out.print("| /          /          /                    ");
            break;
            case 4:
            System.out.print("| /          /          /          /         ");
        }
        Thread.sleep(100);
        switch (playerHealth) {
            case 1:
            System.out.println("| /                                           |");
            break;
            case 2:
            System.out.println("| /          /                                |");
            break;
            case 3:
            System.out.println("| /          /          /                     |");
            break;
            case 4:
            System.out.println("| /          /          /          /          |");
        }
        Thread.sleep(100);
        switch (aiHealth) {
            case 1:
            System.out.print("|/______                                     ");
            break;
            case 2:
            System.out.print("|/______    /______                          ");
            break;
            case 3:
            System.out.print("|/______    /______    /______               ");
            break;
            case 4:
            System.out.print("|/______    /______    /______    /______    ");
        }
        Thread.sleep(100);
        switch (playerHealth) {
            case 1:
            System.out.println("|/______                                      |");
            break;
            case 2:
            System.out.println("|/______    /______                           |");
            break;
            case 3:
            System.out.println("|/______    /______    /______                |");
            break;
            case 4:
            System.out.println("|/______    /______    /______    /______     |");
        }
        Thread.sleep(100);
        switch (aiHealth) {
            case 1:
            System.out.print("|      /                                     ");
            break;
            case 2:
            System.out.print("|      /          /                          ");
            break;
            case 3:
            System.out.print("|      /          /          /               ");
            break;
            case 4:
            System.out.print("|      /          /          /          /    ");
        }
        Thread.sleep(100);
        switch (playerHealth) {
            case 1:
            System.out.println("|      /                                      |");
            break;
            case 2:
            System.out.println("|      /          /                           |");
            break;
            case 3:
            System.out.println("|      /          /          /                |");
            break;
            case 4:
            System.out.println("|      /          /          /          /     |");
        }
        Thread.sleep(100);
        switch (aiHealth) {
            case 1:
            System.out.print("|     /                                      ");
            break;
            case 2:
            System.out.print("|     /          /                           ");
            break;
            case 3:
            System.out.print("|     /          /          /                ");
            break;
            case 4:
            System.out.print("|     /          /          /          /     ");
        }
        Thread.sleep(100);
        switch (playerHealth) {
            case 1:
            System.out.println("|     /                                       |");
            break;
            case 2:
            System.out.println("|     /          /                            |");
            break;
            case 3:
            System.out.println("|     /          /          /                 |");
            break;
            case 4:
            System.out.println("|     /          /          /          /      |");
        }
        Thread.sleep(100);
        switch (aiHealth) {
            case 1:
            System.out.print("|    /                                       ");
            break;
            case 2:
            System.out.print("|    /          /                            ");
            break;
            case 3:
            System.out.print("|    /          /          /                 ");
            break;
            case 4:
            System.out.print("|    /          /          /          /      ");
        }
        Thread.sleep(100);
        switch (playerHealth) {
            case 1:
            System.out.println("|    /                                        |");
            break;
            case 2:
            System.out.println("|    /          /                             |");
            break;
            case 3:
            System.out.println("|    /          /          /                  |");
            break;
            case 4:
            System.out.println("|    /          /          /          /       |");
        }
        Thread.sleep(100);
        switch (aiHealth) {
            case 1:
            System.out.print("|   /                                        ");
            break;
            case 2:
            System.out.print("|   /          /                             ");
            break;
            case 3:
            System.out.print("|   /          /          /                  ");
            break;
            case 4:
            System.out.print("|   /          /          /          /       ");
        }
        Thread.sleep(100);
        switch (playerHealth) {
            case 1:
            System.out.println("|   /                                         |");
            break;
            case 2:
            System.out.println("|   /          /                              |");
            break;
            case 3:
            System.out.println("|   /          /          /                   |");
            break;
            case 4:
            System.out.println("|   /          /          /          /        |");
        }
        Thread.sleep(100);
        switch (aiHealth) {
            case 1:
            System.out.print("|  /                                         ");
            break;
            case 2:
            System.out.print("|  /          /                              ");
            break;
            case 3:
            System.out.print("|  /          /          /                   ");
            break;
            case 4:
            System.out.print("|  /          /          /          /        ");
        }
        Thread.sleep(100);
        switch (playerHealth) {
            case 1:
            System.out.println("|  /                                          |");
            break;
            case 2:
            System.out.println("|  /          /                               |");
            break;
            case 3:
            System.out.println("|  /          /          /                    |");
            break;
            case 4:
            System.out.println("|  /          /          /          /         |");
        }
        Thread.sleep(100);
        System.out.println("|                                            |                                             |");
        Thread.sleep(100);
        System.out.println("+--------------------------------------------+---------------------------------------------+");
        Thread.sleep(100);
        if (playerHealth==1) {
            System.out.println("careful now");
        }
        }

        public static void showShell(int blank,int live) throws InterruptedException {
            int emptySpace = 8 - blank - live;
            System.out.println("+-------------------------------------------------------------------------+");
            Thread.sleep(100);
            switch (live) {
                case 1:
                System.out.print("| " + ANSI_RED + "+======+" + ANSI_RESET);
                break;
                case 2:
                System.out.print("| " + ANSI_RED + "+======+ +======+" + ANSI_RESET);
                break;
                case 3:
                System.out.print("| " + ANSI_RED + "+======+ +======+ +======+" + ANSI_RESET);
                break;
                case 4:
                System.out.print("| " + ANSI_RED + "+======+ +======+ +======+ +======+" + ANSI_RESET);
                break;
            }
            Thread.sleep(100);
            switch (blank) {
                case 1:
                System.out.print(ANSI_BLUE + " +======+" + ANSI_RESET);
                break;
                case 2:
                System.out.print(ANSI_BLUE + " +======+ +======+" + ANSI_RESET);
                break;
                case 3:
                System.out.print(ANSI_BLUE + " +======+ +======+ +======+" + ANSI_RESET);
                break;
                case 4:
                System.out.print(ANSI_BLUE + " +======+ +======+ +======+ +======+" + ANSI_RESET);
                break;
            }
            Thread.sleep(100);
            switch (emptySpace) {
                case 0:
                System.out.println(" |");
                break;
                case 1:
                System.out.println(" +======+ |");
                break;
                case 2:
                System.out.println(" +======+ +======+ |");
                break;
                case 3:
                System.out.println(" +======+ +======+ +======+ |");
                break;
                case 4:
                System.out.println(" +======+ +======+ +======+ +======+ |");
                break;
                case 5:
                System.out.println(" +======+ +======+ +======+ +======+ +======+ |");
                break;
                case 6:
                System.out.println(" +======+ +======+ +======+ +======+ +======+ +=====+ |");
                break;
            }
            Thread.sleep(100);
            for (int i = 0; i < 7; i++) {
                
            
            switch (live) {
                case 1:
                System.out.print("| " + ANSI_RED + "|      |" + ANSI_RESET);
                break;
                case 2:
                System.out.print("| " + ANSI_RED + "|      | |      |" + ANSI_RESET);
                break;
                case 3:
                System.out.print("| " + ANSI_RED + "|      | |      | |      |" + ANSI_RESET);
                break;
                case 4:
                System.out.print("| " + ANSI_RED + "|      | |      | |      | |      |" + ANSI_RESET);
                break;
            }
            Thread.sleep(100);
            switch (blank) {
                case 1:
                System.out.print(ANSI_BLUE + " |      |" + ANSI_RESET);
                break;
                case 2:
                System.out.print(ANSI_BLUE + " |      | |      |" + ANSI_RESET);
                break;
                case 3:
                System.out.print(ANSI_BLUE + " |      | |      | |      |" + ANSI_RESET);
                break;
                case 4:
                System.out.print(ANSI_BLUE + " |      | |      | |      | |      |" + ANSI_RESET);
                break;
            }
            Thread.sleep(100);
            switch (emptySpace) {
                case 0:
                System.out.println(" |");
                break;
                case 1:
                System.out.println(" |      | |");
                break;
                case 2:
                System.out.println(" |      | |      | |");
                break;
                case 3:
                System.out.println(" |      | |      | |      | |");
                break;
                case 4:
                System.out.println(" |      | |      | |      | |      | |");
                break;
                case 5:
                System.out.println(" |      | |      | |      | |      | |      | |");
                break;
                case 6:
                System.out.println(" |      | |      | |      | |      | |      | |      | |");
                break;
            }
            Thread.sleep(100);
        }
        switch (emptySpace) {
            case 0:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " |");
            break;
            case 1:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ |");
            break;
            case 2:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ |");
            break;
            case 3:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ |");
            break;
            case 4:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ +======+ |");
            break;
            case 5:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ +======+ +======+ |");
            break;
            case 6:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ " + ANSI_RESET + "+======+ +======+ +======+ +======+ +======+ +======+ |");
            break;
        }
        Thread.sleep(100);
        switch (emptySpace) {
            case 0:
            System.out.println("| " + ANSI_YELLOW + "|      | |      | |      | |      | |      | |      | |      | |      |" + ANSI_RESET + " |");
            break;
            case 1:
            System.out.println("| " + ANSI_YELLOW + "|      | |      | |      | |      | |      | |      | |      |" + ANSI_RESET + " |      | |");
            break;
            case 2:
            System.out.println("| " + ANSI_YELLOW + "|      | |      | |      | |      | |      | |      |" + ANSI_RESET + " |      | |      | |");
            break;
            case 3:
            System.out.println("| " + ANSI_YELLOW + "|      | |      | |      | |      | |      |" + ANSI_RESET + " |      | |      | |      | |");
            break;
            case 4:
            System.out.println("| " + ANSI_YELLOW + "|      | |      | |      | |      |" + ANSI_RESET + " |      | |      | |      | |      | |");
            break;
            case 5:
            System.out.println("| " + ANSI_YELLOW + "|      | |      | |      |" + ANSI_RESET + " |      | |      | |      | |      | |      | |");
            break;
            case 6:
            System.out.println("| " + ANSI_YELLOW + "|      | |      | " + ANSI_RESET + "|      | |      | |      | |      | |      | |      | |");
            break;
        }
        Thread.sleep(100);
        switch (emptySpace) {
            case 0:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " |");
            break;
            case 1:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ |");
            break;
            case 2:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ |");
            break;
            case 3:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ |");
            break;
            case 4:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ +======+ |");
            break;
            case 5:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ +======+" + ANSI_RESET + " +======+ +======+ +======+ +======+ +======+ |");
            break;
            case 6:
            System.out.println("| " + ANSI_YELLOW + "+======+ +======+ " + ANSI_RESET + "+======+ +======+ +======+ +======+ +======+ +======+ |");
            break;
        }
        Thread.sleep(100);
        System.out.println("+-------------------------------------------------------------------------+");
        Thread.sleep(100);
        }
}
