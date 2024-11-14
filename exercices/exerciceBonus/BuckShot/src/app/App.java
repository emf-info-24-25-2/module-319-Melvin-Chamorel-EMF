package app;

import java.util.Scanner;
import models.players;
import models.Shotgun;
import graphics.*;

public class App {
    public static final int MAX_SHELL = 4;
    public static final int MIN_SHELL = 1;
    public static Scanner scanner;

    // set the finals ints
    public static void main(String[] args) throws InterruptedException {
        int[] shotgun = new int[8];
        Shotgun Shotgun = new Shotgun(shotgun, false);
        int[] inventory = new int[8];
        boolean empty = true;
        int playerTurn = 1;
        boolean IsGameRunnig = true;
        boolean isThePlayerPlaying = true;
        boolean self = true;
        boolean sawed = false;
        scanner = new Scanner(System.in);
        int anger = 0;
        int maxHealth = 0;
        boolean areItemAllowed = true;
        int numberOfPlayer = 0;
        boolean IsAiPlaying = false;
        // set all the variables in the code

        System.out.println("hello there");
        System.out.println("what gamemode you want to play ?");
        System.out.println("1 = speedgame (2 lives per player)");
        System.out.println("2 = clasic (the good old game)");
        System.out.println("3 = no items (no item pure luck and gamble)");
        int gamemode = scanner.nextInt();
        switch (gamemode) {
            case 1:
            maxHealth = 2;
            areItemAllowed = true;
            break;
            case 2:
            maxHealth = 4;
            areItemAllowed = true;
            break;
            case 3:
            maxHealth = 4;
            areItemAllowed = false;
            break;
        }
        System.out.println("alright then.");
        System.out.println("and who do you want to play with ?");
        System.out.println("1 = vs the dealer (a random IA to play with you)");
        System.out.println("2 = PvP (2 player match)");
        System.out.println("3 = hell hole (4 player match)");
        int whoIsPlaying = scanner.nextInt();
        switch (whoIsPlaying) {
            case 1:
            numberOfPlayer = 2;
             IsAiPlaying = true;
                System.out.println("alright see you at the table");
                System.out.println("so what your name fela");
                String name = scanner.nextLine();
                players player = new players(1, name, maxHealth, inventory, false, true);
                players dealer = new players(2, name, maxHealth, inventory, false, true);
                break;
            case 2:
            numberOfPlayer = 2;
                System.out.println("hope you guys have fun in there");
                System.out.println("just before you go there, can i have your names");
                System.out.println("so who is player 1?");
                String name1 = scanner.nextLine();
                players player1 = new players(1, name1, maxHealth, inventory, false, true);
                System.out.println("alright, and you ?");
                String name2 = scanner.nextLine();
                players player2 = new players(2, name2, maxHealth, inventory, false,true);
                break;
            case 3:
            numberOfPlayer = 4;
                System.out.println("you guys are crazy, let me grab the key to the room");
                System.out.println("just i need you guys name and signature to say that i ain't responsable for tf is happening back there alright?");
                System.out.println("so... player 1");
                String name4_1 = scanner.nextLine();
                players player4_1 = new players(1, name4_1, maxHealth, inventory, false, true);
                System.out.println("player 2?");
                String name4_2 = scanner.nextLine();
                players player4_2 = new players(2, name4_2, maxHealth, inventory, false,true);
                System.out.println("player 3!");
                String name4_3 = scanner.nextLine();
                players player4_3 = new players(3, name4_3, maxHealth, inventory, false, true);
                System.out.println("and finaly player 4");
                String name4_4 = scanner.nextLine();
                players player4_4 = new players(4, name4_4, maxHealth, inventory, false, true);
                break;
        }

        while (IsGameRunnig == true) {
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
                Shotgun.reload(int MAX_SHELL,int MIN_SHELL);
                giveItemsAi(aiInventory);
                giveItemsPlayer(playerInventory);
                graphics.shells.showShell(playerTurn, anger);
                playerTurn = 1;

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
    // reload and randomize in a random amount and order


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
}
