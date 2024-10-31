package graphics;

public class board {
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
}
