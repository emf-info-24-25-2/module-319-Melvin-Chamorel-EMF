package exercices.exerciceBonus;
import java.util.Scanner;
import java.lang.Object;

public class buckshotroulette {
    public static final int MAX_SHELL = 4;
    public static final int MIN_SHELL = 1;
    public static final int MAX_HEALTH = 3;
    //set the finals ints
    public static void main(String[] args) throws InterruptedException {
        int[] shotgun = new int [8];
        int[] aiInventory = new int [8];
        int[] playerInventory = new int [8];
        int playerHealth = MAX_HEALTH;
        int aiHealth = MAX_HEALTH;
        boolean empty = true;
        boolean playerTurn = true;
        boolean game = true;
        boolean playing = true;
        boolean self = true;
        boolean player= true;
        boolean sawed = false;

        int anger = 0;
        Scanner scanner = new Scanner(System.in);
        //set all the variables in the code
        //while (game = true) {

            for (int i = 0; i < shotgun.length; i++) {
                if (shotgun[i] == 0) {
                    empty = true;
                }else {
                    empty = false;
                    break;
                }
                if (empty = true) {
                    System.out.println("the shotgun is empty");
                    Thread.sleep(500);
                    reload(shotgun, MAX_SHELL, MIN_SHELL);
                    giveItemsAi(aiInventory);
                    giveItemsPlayer(playerInventory);
                    show(playerInventory, aiInventory, playerHealth, aiHealth);
                    playerTurn = true;
                    
                }
                //check if the shotgun is loaded or no if no reload and gives items to both player
                if (playerTurn = true) {
                    playing = true;
                    while (playing = true) {
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
                            shoot(shotgun, playerHealth, aiHealth, self, player, sawed, playerTurn);
                            break;
                        case 2:
                            self = false;
                            player= true;
                            shoot(shotgun, playerHealth, aiHealth, self, player, sawed, playerTurn);
                            break;
                        case 3:

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

                
                
                
         //   }
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
        Thread.sleep(500);
        return shotgun;
    }
    //reload and randomize in a random amount and order 

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
        //gives the ai random item

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
    //gives player randoms items

    public static void shoot(int[] shotgun, int playerHealth, int aiHealth, boolean self, boolean player, boolean sawed,boolean playerTurn) {
        for (int i = 0; i < shotgun.length; i++) {
            if (shotgun[i] > 0) {
                if (player = true) {
                    if (self = true) {
                        if (shotgun[i] == 1) {
                            System.out.println("click");
                            System.out.println("It's a blank");
                        } else {
                            System.out.println("BOOM!!!");
                            if (sawed = true) {
                                playerHealth -= 2;
                            } else {
                                playerHealth--;
                            }
                            playerTurn = false;
                        }
                    } else {
                        if (shotgun[i] == 1) {
                            System.out.println("click");
                            System.out.println("It's a blank");
                            playerTurn = false;
                        } else {
                            System.out.println("BOOM!!!");
                            if (sawed = true) {
                                aiHealth -= 2;
                            } else {
                                aiHealth--;
                            }
                            playerTurn = false;
                    }
                }
                } else {
                    if (self = true) {
                        if (shotgun[i] == 1) {
                            System.out.println("click");
                            System.out.println("It's a blank");
                        } else {
                            System.out.println("BOOM!!!");
                            if (sawed = true) {
                                aiHealth -= 2;
                            } else {
                                playerHealth--;
                            }
                            playerTurn = true;
                        }
                    } else {
                        if (shotgun[i] == 1) {
                            System.out.println("click");
                            System.out.println("It's a blank");
                            playerTurn = true;
                        } else {
                            System.out.println("BOOM!!!");
                            if (sawed = true) {
                                playerHealth -= 2;
                            } else {
                                playerHealth--;
                            }
                            playerTurn = true;
                } 
            }
            
                }
                shotgun[i] = 0;
                break;
            }
        }
    }
            
        

    public static void useItems(int[] aiInventory, int[] playerInventory, boolean sawed, boolean player) {

    }

    public static void show(int[] playerInventory, int[] aiInventory, int playerHealth, int aiHealth) throws InterruptedException {
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
        System.out.println("|    " + aiInventory[0] + "   |    " + aiInventory[1] + "   |              |    " + aiInventory[2] + "   |    " + aiInventory[3] + "   |");
        Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("+--------+--------+              +--------+--------+");
        Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("|    " + aiInventory[4] + "   |    " + aiInventory[5] + "   |              |    " + aiInventory[6] + "   |    " + aiInventory[7] + "   |");
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
        System.out.println("|    " + playerInventory[0] + "   |    " + playerInventory[1] + "   |              |    " + playerInventory[2] + "   |    " + playerInventory[3] + "   |");
        Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("+--------+--------+              +--------+--------+");
        Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
        Thread.sleep(100);
        System.out.println("|    " + playerInventory[4] + "   |    " + playerInventory[5] + "   |              |    " + playerInventory[6] + "   |    " + playerInventory[7] + "   |");
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
    //show the table to the player

    
}

