package graphics;

import models.players;

public class health {
    public static void showHP(players player1, players player2, players player, players dealer, boolean IsAiPlaying ) throws InterruptedException {
        int health1;
        int health2;
        if (IsAiPlaying) {
            health1 = player.getHP();
            health2 = dealer.getHP();
        }else{
            health1 = player1.getHP();
            health2 = player2.getHP();
        }
        
        System.out.println("+--------------------------------------------+---------------------------------------------+");
        Thread.sleep(100);
        System.out.println("|                                            |                                             |");
        Thread.sleep(100);
        System.out.println("| Dealer                                     | Player                                      |");
        Thread.sleep(100);
        System.out.println("+--------------------------------------------+---------------------------------------------+");
        Thread.sleep(100);
        switch (health2) {
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
        switch (health1) {
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
        switch (health2) {
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
        switch (health1) {
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
        switch (health2) {
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
        switch (health1) {
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
        switch (health2) {
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
        switch (health1) {
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
        switch (health2) {
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
        switch (health1) {
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
        switch (health2) {
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
        switch (health1) {
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
        switch (health2) {
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
        switch (health1) {
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
        switch (health2) {
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
        switch (health1) {
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
        switch (health2) {
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
        switch (health1) {
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
        switch (health2) {
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
        switch (health1) {
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
        }
}
