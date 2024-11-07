package graphics;

import models.players;

public class board {
    public static void show(players player, players dealer, players player1, players player2,boolean IsAiPlaying)
    throws InterruptedException {
        int[] dummyTable;
if (IsAiPlaying) {
  dummyTable = dealer.getInventory();       
} else {
        player2.getInventory();
}




System.out.println("+--------+-----------------------+--------+--------+");
Thread.sleep(100);
        System.out.println("|        |        |              |        |        |");
Thread.sleep(100);
System.out.println("|    " + dummyTable[0] + "   |    " + dummyTable[1] + "   |              |    "
        + dummyTable[2] + "   |    " + dummyTable[3] + "   |");
Thread.sleep(100);
System.out.println("|        |        |              |        |        |");
Thread.sleep(100);
System.out.println("+--------+--------+              +--------+--------+");
Thread.sleep(100);
System.out.println("|        |        |              |        |        |");
Thread.sleep(100);
System.out.println("|    " + dummyTable[4] + "   |    " + dummyTable[5] + "   |              |    "
        + dummyTable[6] + "   |    " + dummyTable[7] + "   |");
Thread.sleep(100);
System.out.println("|        |        |              |        |        |");
Thread.sleep(100);
System.out.println("+--------+--------+              +--------+--------+");
Thread.sleep(100);
for (int i = 0; i < 10; i++) {
    System.out.println("|                                                  |");
    Thread.sleep(100);
}
if (IsAiPlaying) {
        dummyTable = player.getInventory();
}else{
        dummyTable = player1.getInventory();
}

System.out.println("+--------+--------+              +--------+--------+");
Thread.sleep(100);
System.out.println("|        |        |              |        |        |");
Thread.sleep(100);
System.out.println("|    " + dummyTable[0] + "   |    " + dummyTable[1] + "   |              |    "
        + dummyTable[2] + "   |    " + dummyTable[3] + "   |");
Thread.sleep(100);
System.out.println("|        |        |              |        |        |");
Thread.sleep(100);
System.out.println("+--------+--------+              +--------+--------+");
Thread.sleep(100);
System.out.println("|        |        |              |        |        |");
Thread.sleep(100);
System.out.println("|    " + dummyTable[4] + "   |    " + dummyTable[5] + "   |              |    "
        + dummyTable[6] + "   |    " + dummyTable[7] + "   |");
Thread.sleep(100);
System.out.println("|        |        |              |        |        |");
Thread.sleep(100);
System.out.println("+--------+-----------------------+--------+--------+");
Thread.sleep(100);
}
// show the table to the player
}
