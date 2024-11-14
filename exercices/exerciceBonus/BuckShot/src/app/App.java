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
        Shotgun shotgun;
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
        if (numberOfPlayer == 2) {
            if (IsAiPlaying) {
                gamemode1();
            }
            gamemode2();
        } else {
            gamemode3();
        }
    }

        public static void gamemode1(){
            
        }

        public static void gamemode2(){

        }

        public static void gamemode3(){
            graphics.board4.show4(null, null, null, null);
        }
}

          


    

