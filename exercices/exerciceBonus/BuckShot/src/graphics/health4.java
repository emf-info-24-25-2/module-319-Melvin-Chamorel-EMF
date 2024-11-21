package graphics;

import models.players;

public class health4 {

    public static void showHP4Players(players player4_1, players player4_2, players player4_3, players player4_4) throws InterruptedException {
        int fixedLength = 45;
        String formattedString;
        System.out.println("+--------------------------------------------+---------------------------------------------+");
        Thread.sleep(100);
        switch (player4_1.getHP()) {
            case 0:
            System.out.println("|                                            |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
            break;
            case 1:
            System.out.println("|                                            |    /                                        |");
            break;
            case 2:
            System.out.println("|                                            |    /          /                             |");  
            break;
            case 3:
            System.out.println("|                                            |    /          /          /                  |");
            break;
            case 4:
            System.out.println("|                                            |    /          /          /          /       |");  
            break;
        }
        Thread.sleep(100);
        switch (player4_1.getHP()) {
                case 0:
                formattedString = String.format("|%-" + (fixedLength - 1) + "s|  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|", player4_1.getNom());
        
                System.out.println(formattedString);
                break;
                case 1:
                formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /                                         |", player4_1.getNom());
        
                System.out.println(formattedString);
                break;
                case 2:
                formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /                              |", player4_1.getNom());
        
                System.out.println(formattedString);
                break;
                case 3:
                formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /          /                   |", player4_1.getNom());
        
                System.out.println(formattedString);
                break;
                case 4:
                formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /          /          /        |", player4_1.getNom());
        
                System.out.println(formattedString);
                break;
    } 
    Thread.sleep(100);
    switch (player4_1.getHP()) {
        case 0:
        System.out.println("+--------------------------------------------+ /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
        break;
        case 1:
        System.out.println("+--------------------------------------------+  /                                          |");
        break;
        case 2:
        System.out.println("+--------------------------------------------+  /          /                               |");  
        break;
        case 3:
        System.out.println("+--------------------------------------------+  /          /          /                    |");
        break;
        case 4:
        System.out.println("+--------------------------------------------+  /          /          /          /         |");  
        break;
    }
    Thread.sleep(100);
    switch (player4_1.getHP()) {
        case 0:
        System.out.println("|                                            |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
        break;
        case 1:
        System.out.println("|                                            | /          /          /          /          |");
        break;
        case 2:
        System.out.println("|                                            | /          /          /          /          |");  
        break;
        case 3:
        System.out.println("|                                            | /          /          /          /          |");
        break;
        case 4:
        System.out.println("|                                            | /          /          /          /          |");  
        break;
    }
    Thread.sleep(100);
    switch (player4_1.getHP()) {
        case 0:
        System.out.println("|       ______                               |  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|");
        break;
        case 1:
        System.out.println("|                                            |/______                                      |");
        break;
        case 2:
        System.out.println("|                                            |/______    /______                           |");  
        break;
        case 3:
        System.out.println("|                                            |/______    /______    /______                |");
        break;
        case 4:
        System.out.println("|                                            |/______    /______    /______    /______     |");  
        break;
    }
    Thread.sleep(100);
    switch (player4_1.getHP()) {
        case 0:
        System.out.println("|      [      ]                              | /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
        break;
        case 1:
        System.out.println("|                                            |      /                                      |");
        break;
        case 2:
        System.out.println("|                                            |      /          /                           |");  
        break;
        case 3:
        System.out.println("|                                            |      /          /          /                |");
        break;
        case 4:
        System.out.println("|                                            |      /          /          /          /     |");  
        break;
    }
    Thread.sleep(100);
    switch (player4_1.getHP()) {
        case 0:
        System.out.println("|     | 0   0  |                             |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
        break;
        case 1:
        System.out.println("|                                            |     /                                       |");
        break;
        case 2:
        System.out.println("|                                            |     /          /                            |");  
        break;
        case 3:
        System.out.println("|                                            |     /          /          /                 |");
        break;
        case 4:
        System.out.println("|                                            |     /          /          /          /      |");  
        break;
    }
    Thread.sleep(100);
    switch (player4_1.getHP()) {
        case 0:
        System.out.println("|     |   oo   |                             |  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|");
        break;
        case 1:
        System.out.println("|                                            |    /                                        |");
        break;
        case 2:
        System.out.println("|                                            |    /          /                             |");  
        break;
        case 3:
        System.out.println("|                                            |    /          /          /                  |");
        break;
        case 4:
        System.out.println("|                                            |    /          /          /          /       |");  
        break;
    }
    Thread.sleep(100);
    switch (player4_1.getHP()) {
        case 0:
        System.out.println("|      [      ]                              | /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
        break;
        case 1:
        System.out.println("|                                            |   /                                         |");
        break;
        case 2:
        System.out.println("|                                            |   /          /                              |");  
        break;
        case 3:
        System.out.println("|                                            |   /          /          /                   |");
        break;
        case 4:
        System.out.println("|                                            |   /          /          /          /        |");  
        break;
    }
    Thread.sleep(100);
    switch (player4_1.getHP()) {
        case 0:
        System.out.println("|       [][][]                               |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
        break;
        case 1:
        System.out.println("|                                            |  /                                          |");
        break;
        case 2:
        System.out.println("|                                            |  /          /                               |");  
        break;
        case 3:
        System.out.println("|                                            |  /          /          /                    |");
        break;
        case 4:
        System.out.println("|                                            |  /          /          /          /         |");  
        break;
    }
    Thread.sleep(100);
    System.out.println("+--------------------------------------------+---------------------------------------------+");
    Thread.sleep(100);
    switch (player4_2.getHP()) {
        case 0:
        System.out.println("|                                            |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
        break;
        case 1:
        System.out.println("|                                            |    /                                        |");
        break;
        case 2:
        System.out.println("|                                            |    /          /                             |");  
        break;
        case 3:
        System.out.println("|                                            |    /          /          /                  |");
        break;
        case 4:
        System.out.println("|                                            |    /          /          /          /       |");  
        break;
    }
    Thread.sleep(100);
    switch (player4_2.getHP()) {
            case 0:
            formattedString = String.format("|%-" + (fixedLength - 1) + "s|  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|", player4_2.getNom());
    
            System.out.println(formattedString);
            break;
            case 1:
            formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /                                         |", player4_2.getNom());
    
            System.out.println(formattedString);
            break;
            case 2:
            formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /                              |", player4_2.getNom());
    
            System.out.println(formattedString);
            break;
            case 3:
            formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /          /                   |", player4_2.getNom());
    
            System.out.println(formattedString);
            break;
            case 4:
            formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /          /          /        |", player4_2.getNom());
    
            System.out.println(formattedString);
            break;
} 
Thread.sleep(100);
switch (player4_2.getHP()) {
    case 0:
    System.out.println("+--------------------------------------------+ /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
    break;
    case 1:
    System.out.println("+--------------------------------------------+  /                                          |");
    break;
    case 2:
    System.out.println("+--------------------------------------------+  /          /                               |");  
    break;
    case 3:
    System.out.println("+--------------------------------------------+  /          /          /                    |");
    break;
    case 4:
    System.out.println("+--------------------------------------------+  /          /          /          /         |");  
    break;
}
Thread.sleep(100);
switch (player4_2.getHP()) {
    case 0:
    System.out.println("|                                            |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
    break;
    case 1:
    System.out.println("|                                            | /          /          /          /          |");
    break;
    case 2:
    System.out.println("|                                            | /          /          /          /          |");  
    break;
    case 3:
    System.out.println("|                                            | /          /          /          /          |");
    break;
    case 4:
    System.out.println("|                                            | /          /          /          /          |");  
    break;
}
Thread.sleep(100);
switch (player4_2.getHP()) {
    case 0:
    System.out.println("|       ______                               |  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|");
    break;
    case 1:
    System.out.println("|                                            |/______                                      |");
    break;
    case 2:
    System.out.println("|                                            |/______    /______                           |");  
    break;
    case 3:
    System.out.println("|                                            |/______    /______    /______                |");
    break;
    case 4:
    System.out.println("|                                            |/______    /______    /______    /______     |");  
    break;
}
Thread.sleep(100);
switch (player4_2.getHP()) {
    case 0:
    System.out.println("|      [      ]                              | /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
    break;
    case 1:
    System.out.println("|                                            |      /                                      |");
    break;
    case 2:
    System.out.println("|                                            |      /          /                           |");  
    break;
    case 3:
    System.out.println("|                                            |      /          /          /                |");
    break;
    case 4:
    System.out.println("|                                            |      /          /          /          /     |");  
    break;
}
Thread.sleep(100);
switch (player4_2.getHP()) {
    case 0:
    System.out.println("|     | 0   0  |                             |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
    break;
    case 1:
    System.out.println("|                                            |     /                                       |");
    break;
    case 2:
    System.out.println("|                                            |     /          /                            |");  
    break;
    case 3:
    System.out.println("|                                            |     /          /          /                 |");
    break;
    case 4:
    System.out.println("|                                            |     /          /          /          /      |");  
    break;
}
Thread.sleep(100);
switch (player4_2.getHP()) {
    case 0:
    System.out.println("|     |   oo   |                             |  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|");
    break;
    case 1:
    System.out.println("|                                            |    /                                        |");
    break;
    case 2:
    System.out.println("|                                            |    /          /                             |");  
    break;
    case 3:
    System.out.println("|                                            |    /          /          /                  |");
    break;
    case 4:
    System.out.println("|                                            |    /          /          /          /       |");  
    break;
}
Thread.sleep(100);
switch (player4_2.getHP()) {
    case 0:
    System.out.println("|      [      ]                              | /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
    break;
    case 1:
    System.out.println("|                                            |   /                                         |");
    break;
    case 2:
    System.out.println("|                                            |   /          /                              |");  
    break;
    case 3:
    System.out.println("|                                            |   /          /          /                   |");
    break;
    case 4:
    System.out.println("|                                            |   /          /          /          /        |");  
    break;
}
Thread.sleep(100);
switch (player4_2.getHP()) {
    case 0:
    System.out.println("|       [][][]                               |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
    break;
    case 1:
    System.out.println("|                                            |  /                                          |");
    break;
    case 2:
    System.out.println("|                                            |  /          /                               |");  
    break;
    case 3:
    System.out.println("|                                            |  /          /          /                    |");
    break;
    case 4:
    System.out.println("|                                            |  /          /          /          /         |");  
    break;
}
Thread.sleep(100);
System.out.println("+--------------------------------------------+---------------------------------------------+");
switch (player4_3.getHP()) {
    case 0:
    System.out.println("|                                            |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
    break;
    case 1:
    System.out.println("|                                            |    /                                        |");
    break;
    case 2:
    System.out.println("|                                            |    /          /                             |");  
    break;
    case 3:
    System.out.println("|                                            |    /          /          /                  |");
    break;
    case 4:
    System.out.println("|                                            |    /          /          /          /       |");  
    break;
}
Thread.sleep(100);
switch (player4_3.getHP()) {
        case 0:
        formattedString = String.format("|%-" + (fixedLength - 1) + "s|  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|", player4_3.getNom());

        System.out.println(formattedString);
        break;
        case 1:
        formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /                                         |", player4_3.getNom());

        System.out.println(formattedString);
        break;
        case 2:
        formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /                              |", player4_3.getNom());

        System.out.println(formattedString);
        break;
        case 3:
        formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /          /                   |", player4_3.getNom());

        System.out.println(formattedString);
        break;
        case 4:
        formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /          /          /        |", player4_3.getNom());

        System.out.println(formattedString);
        break;
} 
Thread.sleep(100);
switch (player4_3.getHP()) {
case 0:
System.out.println("+--------------------------------------------+ /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
break;
case 1:
System.out.println("+--------------------------------------------+  /                                          |");
break;
case 2:
System.out.println("+--------------------------------------------+  /          /                               |");  
break;
case 3:
System.out.println("+--------------------------------------------+  /          /          /                    |");
break;
case 4:
System.out.println("+--------------------------------------------+  /          /          /          /         |");  
break;
}
Thread.sleep(100);
switch (player4_3.getHP()) {
case 0:
System.out.println("|                                            |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
break;
case 1:
System.out.println("|                                            | /          /          /          /          |");
break;
case 2:
System.out.println("|                                            | /          /          /          /          |");  
break;
case 3:
System.out.println("|                                            | /          /          /          /          |");
break;
case 4:
System.out.println("|                                            | /          /          /          /          |");  
break;
}
Thread.sleep(100);
switch (player4_3.getHP()) {
case 0:
System.out.println("|       ______                               |  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|");
break;
case 1:
System.out.println("|                                            |/______                                      |");
break;
case 2:
System.out.println("|                                            |/______    /______                           |");  
break;
case 3:
System.out.println("|                                            |/______    /______    /______                |");
break;
case 4:
System.out.println("|                                            |/______    /______    /______    /______     |");  
break;
}
Thread.sleep(100);
switch (player4_3.getHP()) {
case 0:
System.out.println("|      [      ]                              | /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
break;
case 1:
System.out.println("|                                            |      /                                      |");
break;
case 2:
System.out.println("|                                            |      /          /                           |");  
break;
case 3:
System.out.println("|                                            |      /          /          /                |");
break;
case 4:
System.out.println("|                                            |      /          /          /          /     |");  
break;
}
Thread.sleep(100);
switch (player4_3.getHP()) {
case 0:
System.out.println("|     | 0   0  |                             |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
break;
case 1:
System.out.println("|                                            |     /                                       |");
break;
case 2:
System.out.println("|                                            |     /          /                            |");  
break;
case 3:
System.out.println("|                                            |     /          /          /                 |");
break;
case 4:
System.out.println("|                                            |     /          /          /          /      |");  
break;
}
Thread.sleep(100);
switch (player4_3.getHP()) {
case 0:
System.out.println("|     |   oo   |                             |  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|");
break;
case 1:
System.out.println("|                                            |    /                                        |");
break;
case 2:
System.out.println("|                                            |    /          /                             |");  
break;
case 3:
System.out.println("|                                            |    /          /          /                  |");
break;
case 4:
System.out.println("|                                            |    /          /          /          /       |");  
break;
}
Thread.sleep(100);
switch (player4_3.getHP()) {
case 0:
System.out.println("|      [      ]                              | /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
break;
case 1:
System.out.println("|                                            |   /                                         |");
break;
case 2:
System.out.println("|                                            |   /          /                              |");  
break;
case 3:
System.out.println("|                                            |   /          /          /                   |");
break;
case 4:
System.out.println("|                                            |   /          /          /          /        |");  
break;
}
Thread.sleep(100);
switch (player4_3.getHP()) {
case 0:
System.out.println("|       [][][]                               |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
break;
case 1:
System.out.println("|                                            |  /                                          |");
break;
case 2:
System.out.println("|                                            |  /          /                               |");  
break;
case 3:
System.out.println("|                                            |  /          /          /                    |");
break;
case 4:
System.out.println("|                                            |  /          /          /          /         |");  
break;
}
Thread.sleep(100);
System.out.println("+--------------------------------------------+---------------------------------------------+");
Thread.sleep(100);
switch (player4_4.getHP()) {
    case 0:
    System.out.println("|                                            |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
    break;
    case 1:
    System.out.println("|                                            |    /                                        |");
    break;
    case 2:
    System.out.println("|                                            |    /          /                             |");  
    break;
    case 3:
    System.out.println("|                                            |    /          /          /                  |");
    break;
    case 4:
    System.out.println("|                                            |    /          /          /          /       |");  
    break;
}
Thread.sleep(100);
switch (player4_4.getHP()) {
        case 0:
        formattedString = String.format("|%-" + (fixedLength - 1) + "s|  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|", player4_4.getNom());

        System.out.println(formattedString);
        break;
        case 1:
        formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /                                         |", player4_4.getNom());

        System.out.println(formattedString);
        break;
        case 2:
        formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /                              |", player4_4.getNom());

        System.out.println(formattedString);
        break;
        case 3:
        formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /          /                   |", player4_4.getNom());

        System.out.println(formattedString);
        break;
        case 4:
        formattedString = String.format("|%-" + (fixedLength - 1) + "s|   /          /          /          /        |", player4_4.getNom());

        System.out.println(formattedString);
        break;
} 
Thread.sleep(100);
switch (player4_4.getHP()) {
case 0:
System.out.println("+--------------------------------------------+ /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
break;
case 1:
System.out.println("+--------------------------------------------+  /                                          |");
break;
case 2:
System.out.println("+--------------------------------------------+  /          /                               |");  
break;
case 3:
System.out.println("+--------------------------------------------+  /          /          /                    |");
break;
case 4:
System.out.println("+--------------------------------------------+  /          /          /          /         |");  
break;
}
Thread.sleep(100);
switch (player4_4.getHP()) {
case 0:
System.out.println("|                                            |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
break;
case 1:
System.out.println("|                                            | /          /          /          /          |");
break;
case 2:
System.out.println("|                                            | /          /          /          /          |");  
break;
case 3:
System.out.println("|                                            | /          /          /          /          |");
break;
case 4:
System.out.println("|                                            | /          /          /          /          |");  
break;
}
Thread.sleep(100);
switch (player4_4.getHP()) {
case 0:
System.out.println("|       ______                               |  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|");
break;
case 1:
System.out.println("|                                            |/______                                      |");
break;
case 2:
System.out.println("|                                            |/______    /______                           |");  
break;
case 3:
System.out.println("|                                            |/______    /______    /______                |");
break;
case 4:
System.out.println("|                                            |/______    /______    /______    /______     |");  
break;
}
Thread.sleep(100);
switch (player4_4.getHP()) {
case 0:
System.out.println("|      [      ]                              | /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
break;
case 1:
System.out.println("|                                            |      /                                      |");
break;
case 2:
System.out.println("|                                            |      /          /                           |");  
break;
case 3:
System.out.println("|                                            |      /          /          /                |");
break;
case 4:
System.out.println("|                                            |      /          /          /          /     |");  
break;
}
Thread.sleep(100);
switch (player4_4.getHP()) {
case 0:
System.out.println("|     | 0   0  |                             |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
break;
case 1:
System.out.println("|                                            |     /                                       |");
break;
case 2:
System.out.println("|                                            |     /          /                            |");  
break;
case 3:
System.out.println("|                                            |     /          /          /                 |");
break;
case 4:
System.out.println("|                                            |     /          /          /          /      |");  
break;
}
Thread.sleep(100);
switch (player4_4.getHP()) {
case 0:
System.out.println("|     |   oo   |                             |  /  /  /  /  /  /  /  /  /  /  /  /  /  /  /|");
break;
case 1:
System.out.println("|                                            |    /                                        |");
break;
case 2:
System.out.println("|                                            |    /          /                             |");  
break;
case 3:
System.out.println("|                                            |    /          /          /                  |");
break;
case 4:
System.out.println("|                                            |    /          /          /          /       |");  
break;
}
Thread.sleep(100);
switch (player4_4.getHP()) {
case 0:
System.out.println("|      [      ]                              | /  /  /  /  /  /  /  /  /  /  /  /  /  /  / |");
break;
case 1:
System.out.println("|                                            |   /                                         |");
break;
case 2:
System.out.println("|                                            |   /          /                              |");  
break;
case 3:
System.out.println("|                                            |   /          /          /                   |");
break;
case 4:
System.out.println("|                                            |   /          /          /          /        |");  
break;
}
Thread.sleep(100);
switch (player4_4.getHP()) {
case 0:
System.out.println("|       [][][]                               |/  /  /  /  /  /  /  /  /  /  /  /  /  /  /  |");
break;
case 1:
System.out.println("|                                            |  /                                          |");
break;
case 2:
System.out.println("|                                            |  /          /                               |");  
break;
case 3:
System.out.println("|                                            |  /          /          /                    |");
break;
case 4:
System.out.println("|                                            |  /          /          /          /         |");  
break;
}
Thread.sleep(100);
System.out.println("+--------------------------------------------+---------------------------------------------+");
Thread.sleep(100);
}
}