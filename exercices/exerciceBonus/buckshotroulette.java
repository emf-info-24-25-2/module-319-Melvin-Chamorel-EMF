package exercices.exerciceBonus;

import java.util.Scanner;


public class buckshotroulette {
    public static final int MAX_SHELL = 4;
    public static final int MIN_SHELL = 1;
    public static final int MAX_HEALTH = 3;

    // set the finals ints
    public static void main(String[] args) throws InterruptedException {
        int[] shotgun = new int[8];
        int[] aiInventory = new int[8];
        int[] playerInventory = new int[8];
        int playerHealth = MAX_HEALTH;
        int aiHealth = MAX_HEALTH;
        boolean empty = true;
        boolean playerTurn = true;
        boolean game = true;
        boolean playing = true;
        boolean self = true;
        boolean player = true;
        boolean sawed = false;

        int anger = 0;
        Scanner scanner = new Scanner(System.in);
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
                    System.out.println("3: use use item");

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

            }

            }
            scanner.close();
        }
        

    

    public static int[] reload(int[] shotgun, int MAX_SHELL, int MIN_SHELL) throws InterruptedException {
        int blank = (int) (Math.random() * (MAX_SHELL - MIN_SHELL + 1)) + MIN_SHELL;
        int live = (int) (Math.random() * (MAX_SHELL - MIN_SHELL + 1)) + MIN_SHELL;
        int shells = blank + live;
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
                            System.out.println("click");
                            Thread.sleep(500);
                            System.out.println("It's a blank");
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
                            System.out.println("click");
                            Thread.sleep(500);
                            System.out.println("It's a blank");
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
                            System.out.println("click");
                            Thread.sleep(500);
                            System.out.println("It's a blank");
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
                            System.out.println("click");
                            Thread.sleep(500);
                            System.out.println("It's a blank");
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
        Scanner scanner = new Scanner(System.in);
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
                    default:
                        System.out.println(i + 1 + ": empty");
                        Thread.sleep(500);
                        break;
                }
            }

                int chois = scanner.nextInt();
                switch (playerInventory[chois - 1]) {
                    case 1:
                       
                        break;
                    case 2:
                    
                        break;
                    case 3:
                    if (playerHealth < MAX_HEALTH) {
                        System.out.println("you smoke a cigarette, the pain in decresing");
                        Thread.sleep(500);
                        System.out.println("+1 HP");
                        Thread.sleep(500);
                        playerHealth++;
                        playerInventory[chois - 1] = 0;
                    }
                        break;
                    case 4:
                    System.out.println("you take the saw and saw the barel off");
                    Thread.sleep(500);
                    System.out.println("damage 2x (it's gona hurt)");
                    Thread.sleep(500);
                    sawed = true;
                    playerInventory[chois - 1] = 0;
                        break;
                    default:
                    System.out.println("you grab air and trow it at the dealer");
                    Thread.sleep(500);
                    System.out.println("it's useless");
                    Thread.sleep(500);
                        break;
                }
            
        } else {
            
        }
        scanner.close(); 
    }



    public static void show(int[] playerInventory, int[] aiInventory, int playerHealth, int aiHealth)
            throws InterruptedException {
        System.out.println("+--------+-----------------------+--------+--------+");
        Thread.sleep(100);
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
        Thread.sleep(100);
        System.out.println("+--------+-----------------------+--------+--------+");
        Thread.sleep(100);
    }
    // show the table to the player

}
