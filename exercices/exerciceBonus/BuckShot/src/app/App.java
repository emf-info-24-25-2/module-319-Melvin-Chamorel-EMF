package app;

import java.util.Scanner;
import models.players;
import models.Shotgun;
import graphics.board;
import graphics.board4;
import graphics.health;
import graphics.health4;
import graphics.shells;

public class App {
    public static Scanner scanner;

    // set the finals ints
    public static void main(String[] args) throws InterruptedException {
        Shotgun shotgun = new Shotgun();
        int playerTurn = 1;
        boolean IsGameRunning = true;
        boolean isThePlayerPlaying = true;
        scanner = new Scanner(System.in);
        int maxHealth = 0;
        boolean areItemAllowed = true;
        int numberOfPlayer = 0;
        boolean IsAiPlaying = false;
        players player = new players(0, null, maxHealth, false, true);
        players dealer = new players(0, "the dealer", maxHealth, false, true);
        players player1 = new players(0, null, maxHealth, false, true);
        players player2 = new players(0, null, maxHealth, false, true);
        players player4_1 = new players(0, null, maxHealth,false, true);
        players player4_2 = new players(0, null, maxHealth, false, true);
        players player4_3 = new players(0, null, maxHealth, false, true);
        players player4_4 = new players(0, null, maxHealth, false, true);
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
                String test3 = scanner.nextLine();
                String name = scanner.nextLine();
                player.setNom(name);
                player.setHP(maxHealth);
                dealer.setHP(maxHealth);
                player.setId(1);
                dealer.setId(2);
                break;
            case 2:
            numberOfPlayer = 2;
                System.out.println("hope you guys have fun in there");
                System.out.println("just before you go there, can i have your names");
                System.out.println("so who is player 1?");
                String test1 = scanner.nextLine();
                String name1 = scanner.nextLine();
                player1.setNom(name1);
                player1.setHP(maxHealth);
                player1.setId(1);
                System.out.println("alright, and you ?");
                String name2 = scanner.nextLine();
                player2.setNom(name2);
                player2.setHP(maxHealth);
                player2.setId(2);
                break;
            case 3:
            numberOfPlayer = 4;
                System.out.println("you guys are crazy, let me grab the key to the room");
                System.out.println("just i need you guys name and signature to say that i ain't responsable for tf is happening back there alright?");
                System.out.println("so... player 1");
                String test2 = scanner.nextLine();
                String name4_1 = scanner.nextLine();
                player4_1.setNom(name4_1);
                player4_1.setHP(maxHealth);
                player4_1.setId(1);
                System.out.println("player 2?");
                String name4_2 = scanner.nextLine();
                player4_2.setNom(name4_2);
                player4_2.setHP(maxHealth);
                player4_2.setId(2);
                System.out.println("player 3!");
                String name4_3 = scanner.nextLine();
                player4_3.setNom(name4_3);
                player4_3.setHP(maxHealth);
                player4_3.setId(3);
                System.out.println("and finaly player 4");
                String name4_4 = scanner.nextLine();
                player4_4.setNom(name4_4);
                player4_4.setHP(maxHealth);
                player4_4.setId(4);
                break;
        }
        if (numberOfPlayer == 2) {
            if (IsAiPlaying) {
                gamemode1(playerTurn, IsGameRunning, areItemAllowed, player4_4, dealer, IsAiPlaying, player1, player2, shotgun);
            } else {
                gamemode2(playerTurn,IsGameRunning, areItemAllowed, player, dealer, IsAiPlaying, player1, player2, shotgun);
            }
            
        } else {
            gamemode3(playerTurn, IsGameRunning, areItemAllowed, player4_1, player4_2, player4_3, player4_4, shotgun);
        }
    }

        public static void gamemode1(int playerTurn, boolean IsGameRunning, boolean areItemAllowed, players player, players dealer, boolean IsAiPlaying, players player1,players player2, Shotgun shotgun)throws InterruptedException{
            int maxTurn = 2;
            while (IsGameRunning) {
            if (shotgun.isEmpty()) {
                shotgun.reload();
                if (areItemAllowed) {
                    player.giveItems();
                    dealer.giveItems();
                    graphics.board.show(player, dealer, player1, player2, IsAiPlaying);    
                }
                if (playerTurn == 1) {
                        System.out.println("it's " + player.getNom() + "'s turn");
                        System.out.println("what do you eant ot do ?");
                        System.out.println("1: shoot");
                        System.out.println("2: see board");
                        System.out.println("3: see HP");
                        System.out.println("4: use items");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                shotgun.shoot(choice, playerTurn, playerTurn);
                                break;
                            case 2:
                                graphics.board.show(player, dealer, player1, player2, IsAiPlaying);
                                break;
                            case 3:
                                graphics.health.showHP(player1, player2, player2, dealer, IsAiPlaying);;
                                break;
                            case 4:
                                player.useItems(shotgun);
                                break;
                        }

                    } else if (playerTurn == 2) {
                        System.out.println("it's " + dealer.getNom() + "'s turn");
                        int iaRandom = (int) (Math.random() * (2 - 1 + 1)) + 1;
                        switch (iaRandom) {
                            case 1:
                                shotgun.aiShoot();
                                break;
                            case 2:
                                dealer.aiUseItems();
                                break;

                        }
                    }
            }
            }
        }

        public static void gamemode2(int playerTurn,boolean IsGameRunning, boolean areItemAllowed, players player, players dealer, boolean IsAiPlaying, players player1,players player2, Shotgun shotgun)throws InterruptedException{
             while (IsGameRunning) {
                if (shotgun.isEmpty()) {
                    shotgun.reload();
                    if (areItemAllowed) {
                        player1.giveItems();
                        player2.giveItems();
                        graphics.board.show(player, dealer, player1, player2, IsAiPlaying);
                    }
                    if (playerTurn == 1) {
                        System.out.println("it's " + player1.getNom() + "'s turn");
                        System.out.println("what do you eant ot do ?");
                        System.out.println("1: shoot");
                        System.out.println("2: see board");
                        System.out.println("3: see HP");
                        System.out.println("4: use items");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                shotgun.shoot(choice, playerTurn, playerTurn);
                                break;
                            case 2:
                                graphics.board.show(player, dealer, player1, player2, IsAiPlaying);
                                break;
                            case 3:
                                graphics.health.showHP(player1, player2, player2, dealer, IsAiPlaying);;
                                break;
                            case 4:
                                player1.useItems(shotgun);
                                break;
                        }

                    } else if (playerTurn == 2) {
                        System.out.println("it's " + player2.getNom() + "'s turn");
                        System.out.println("what do you eant ot do ?");
                        System.out.println("1: shoot");
                        System.out.println("2: see board");
                        System.out.println("3: see HP");
                        System.out.println("4: use items");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                shotgun.shoot(choice, playerTurn, playerTurn);
                                break;
                            case 2:
                                graphics.board.show(player, dealer, player1, player2, IsAiPlaying);
                                break;
                            case 3:
                                graphics.health.showHP(player1, player2, player2, dealer, IsAiPlaying);;
                                break;
                            case 4:
                                player2.useItems(shotgun);
                                break;
                        }
                    }
                }

            }
        }

        public static void gamemode3(int playerTurn,boolean IsGameRunning,boolean areItemAllowed, players player4_1, players player4_2, players player4_3, players player4_4, Shotgun shotgun) throws InterruptedException{
            while (IsGameRunning) {
                
                if (shotgun.isEmpty()) {
                    shotgun.reload();
                    if (areItemAllowed) {
                        if (!player4_1.isDead()) {
                            player4_1.giveItems();
                        }
                        if (!player4_2.isDead()) {
                            player4_2.giveItems();
                        }
                        if (!player4_3.isDead()) {
                            player4_3.giveItems();
                        }
                        if (!player4_4.isDead()) {
                            player4_4.giveItems();
                        }  
                    }
                    
                }
                if (playerTurn == 1) {
                    System.out.println("it's " + player4_1.getNom() + "'s turn");
                    System.out.println("what do you eant ot do ?");
                    System.out.println("1: shoot");
                    System.out.println("2: see board");
                    System.out.println("3: see HP");
                    System.out.println("4: use items");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            shotgun.shoot(choice, playerTurn, playerTurn);
                            break;
                        case 2:
                            graphics.board4.show4(player4_1, player4_2, player4_3, player4_4);
                            break;
                        case 3:
                            graphics.health4.showHP4Players(player4_1, player4_2, player4_3, player4_4);
                            break;
                        case 4:
                            player4_1.useItems(shotgun);
                            break;
                    }

                } else if (playerTurn == 2) {
                    System.out.println("it's " + player4_2.getNom() + "'s turn");
                    System.out.println("what do you eant ot do ?");
                    System.out.println("1: shoot");
                    System.out.println("2: see board");
                    System.out.println("3: see HP");
                    System.out.println("4: use items");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            shotgun.shoot(choice, playerTurn, playerTurn);;
                            break;
                        case 2:
                            graphics.board4.show4(player4_1, player4_2, player4_3, player4_4);
                            break;
                        case 3:
                            graphics.health4.showHP4Players(player4_1, player4_2, player4_3, player4_4);
                            break;
                        case 4:
                            player4_2.useItems(shotgun);
                            break;
                    }

                } else if (playerTurn == 3) {
                    System.out.println("it's " + player4_3.getNom() + "'s turn");
                    System.out.println("what do you eant ot do ?");
                    System.out.println("1: shoot");
                    System.out.println("2: see board");
                    System.out.println("3: see HP");
                    System.out.println("4: use items");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            shotgun.shoot(choice, playerTurn, playerTurn);;
                            break;
                        case 2:
                            graphics.board4.show4(player4_1, player4_2, player4_3, player4_4);
                            break;
                        case 3:
                            graphics.health4.showHP4Players(player4_1, player4_2, player4_3, player4_4);
                            break;
                        case 4:
                            player4_3.useItems(shotgun);
                            break;
                    }

                } else if (playerTurn == 4) {
                    System.out.println("it's " + player4_4.getNom() + "'s turn");
                    System.out.println("what do you eant ot do ?");
                    System.out.println("1: shoot");
                    System.out.println("2: see board");
                    System.out.println("3: see HP");
                    System.out.println("4: use items");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            shotgun.shoot(choice, playerTurn, playerTurn);
                            break;
                        case 2:
                            graphics.board4.show4(player4_1, player4_2, player4_3, player4_4);
                            break;
                        case 3:
                            graphics.health4.showHP4Players(player4_1, player4_2, player4_3, player4_4);
                            break;
                        case 4:
                            player4_4.useItems(shotgun);
                            break;
                    }

                }

            }
        }
}

          


    

