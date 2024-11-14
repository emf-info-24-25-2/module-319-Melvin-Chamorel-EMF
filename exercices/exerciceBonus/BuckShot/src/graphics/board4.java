package graphics;

import models.players;

public class board4 {
    public static void show4(players player4_1, players player4_2, players player4_3,players player4_4){
        int[] dummyTable1;
        int[] dummyTable2;

        dummyTable1 = player4_2.getInventory();
        System.out.println("         +--------+--------+--------+--------+");
        System.out.println("         |        |        |        |        |");
        System.out.println("         |    "+ dummyTable1[0] +"   |    "+ dummyTable1[1] +"   |    "+ dummyTable1[2] +"   |    "+ dummyTable1[3] +"   |");
        System.out.println("         |        |        |        |        |");
        System.out.println("         +--------+--------+--------+--------+");
        System.out.println("         |        |        |        |        |");
        System.out.println("         |    "+ dummyTable1[4] +"   |    "+ dummyTable1[5] +"   |    "+ dummyTable1[6] +"   |    "+ dummyTable1[7] +"   |");
        System.out.println("         |        |        |        |        |");
        System.out.println("         +--------+--------+--------+--------+");
        dummyTable1 = player4_3.getInventory();
        dummyTable2 = player4_4.getInventory();
        System.out.println("         |                                   |");
        System.out.println("         |                                   |");
        System.out.println("+--------+--------+                 +--------+--------+");
        System.out.println("|        |        |                 |        |        |");
        System.out.println("|    "+ dummyTable1[0] +"   |    "+dummyTable1[1]+"   |                 |    "+dummyTable2[0]+"   |    "+dummyTable2[1]+"   |");
        System.out.println("|        |        |                 |        |        |");
        System.out.println("+--------+--------+                 +--------+--------+");
        System.out.println("|        |        |                 |        |        |");
        System.out.println("|    "+ dummyTable1[2] +"   |    "+dummyTable1[3]+"   |                 |    "+dummyTable2[2]+"   |    "+dummyTable2[3]+"   |");
        System.out.println("|        |        |                 |        |        |");
        System.out.println("+--------+--------+                 +--------+--------+");
        System.out.println("|        |        |                 |        |        |");
        System.out.println("|    "+ dummyTable1[4] +"   |    "+dummyTable1[5]+"   |                 |    "+dummyTable2[4]+"   |    "+dummyTable2[5]+"   |");
        System.out.println("|        |        |                 |        |        |");
        System.out.println("+--------+--------+                 +--------+--------+");
        System.out.println("|        |        |                 |        |        |");
        System.out.println("|    "+ dummyTable1[6] +"   |    "+dummyTable1[7]+"   |                 |    "+dummyTable2[6]+"   |    "+dummyTable2[7]+"   |");
        System.out.println("|        |        |                 |        |        |");
        System.out.println("+--------+--------+                 +--------+--------+");
        System.out.println("         |                                   |");
        System.out.println("         |                                   |");
        dummyTable1 = player4_1.getInventory();
        System.out.println("         +--------+--------+--------+--------+");
        System.out.println("         |        |        |        |        |");
        System.out.println("         |    "+ dummyTable1[0] +"   |    "+ dummyTable1[1] +"   |    "+ dummyTable1[2] +"   |    "+ dummyTable1[3] +"   |");
        System.out.println("         |        |        |        |        |");
        System.out.println("         +--------+--------+--------+--------+");
        System.out.println("         |        |        |        |        |");
        System.out.println("         |    "+ dummyTable1[4] +"   |    "+ dummyTable1[5] +"   |    "+ dummyTable1[6] +"   |    "+ dummyTable1[7] +"   |");
        System.out.println("         |        |        |        |        |");
        System.out.println("         +--------+--------+--------+--------+");
    }
}
